package com.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PlayerMain {
	Scanner sc = new Scanner(System.in);
	Connection con;

	public PlayerMain() { // �����ڿ��� ������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pwd = "hr";
			con = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbUse() {
		while (true) {
			System.out.println("1.������� 2. ������ü���� 3. ���� ã�� 4. �������� ����  5 ���� Ż�� 6. ����");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				playerInsert();
			} else if (choice == 2) {
				playerView();
			} else if (choice == 3) {
				System.out.println("ã�� ���� �̸�>>");
				String name = sc.next();
				playerSearch(name);
			} else if (choice == 4) {
				playerUpdate();
			} else if (choice == 5) {
				playerDelete();
			} else if (choice == 6) {
				playerExit();
			} else {
				System.out.println("�Է¿���");
			}
		}
	}

	// 4�� ����
	private void playerUpdate() {
		System.out.println("������ ���� �̸�>>");
		String name = sc.next();
		playerSearch(name);
		System.out.println("������ ���� ��ȣ>>");
		int num = sc.nextInt();
		System.out.println("������ ���� 1.�̸� 2.Ű  3.������ 4.����");
		int changNum = sc.nextInt();
		System.out.println("��������>>>");
		String content = sc.next();
		String colName = "";
		switch (changNum) {
		case 1:
			colName = "name";
			break;
		case 2:
			colName = "height";
			break;
		case 3:
			colName = "weight";
			break;
		case 4:
			colName = "kind";
			break;
		}

		String sql = "";
		if (changNum == 1 || changNum == 4) { // ����
			sql = "update player set " + colName + "='" + content + "' where num=" + num;
		} else { // ����
			sql = "update player set " + colName + "=" + content + " where num=" + num;
		}
		System.out.println(sql);
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 5�� Ż��
	private void playerDelete() {
		/*
		 * 1.Ż���� ������ �̸� ���� 
		 * 2.�̸��� �ش��ϴ� ������ ������ �����ְ� (playerSearch �޼ҵ忡�� ó��) 
		 * 3.���� ��ȣ�� �Է��ϰ� 
		 * 4.�� ��ȣ�� �ش��ϴ� ���� Ż��
		 */
		System.out.println("Ż���� ���� �̸� >>");
		String name = sc.next();
		playerSearch(name);
		System.out.println("Ż���� ���� ��ȣ >>");
		int num = sc.nextInt();
		String sql = "delete from player where num=" + num;
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void playerSearch(String name) { // �̸��� �ش��ϴ� ���� ���
		String sql = "select * from player where name like '%" + name + "%'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("��ȣ : " + rs.getInt("num"));
				System.out.println("�̸� : " + rs.getString("name"));
				System.out.println("Ű : " + rs.getInt("height"));
				System.out.println("������ : " + rs.getInt("weight"));
				System.out.println("���� : " + rs.getString("kind"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 6 �� ����
	private void playerExit() {
		System.out.println("���α׷�����");
		System.exit(0);
	}

	private void playerInsert() { // 1.�������
		System.out.println("�̸� >>");
		String name = sc.nextLine(); // ȫ�浿
		System.out.println("Ű >>");
		int height = sc.nextInt(); // 180
		System.out.println("������ >>"); // 100
		int weight = sc.nextInt();
		sc.nextLine();
		System.out.println("���� >>"); // �߱�
		String kind = sc.nextLine();
		String sql = "insert into player(num, name, height, weight, kind) " + " values(player_seq.nextval, ?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, height);
			ps.setInt(3, weight);
			ps.setString(4, kind);
			ps.executeUpdate(); // sql �� ����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void playerView() {// 2.���� ��ü����
		String sql = "select * from player";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("��ȣ : " + rs.getInt("num"));
				System.out.println("�̸� : " + rs.getString("name"));
				System.out.println("Ű : " + rs.getInt("height"));
				System.out.println("������ : " + rs.getInt("weight"));
				System.out.println("���� : " + rs.getString("kind"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		PlayerMain pm = new PlayerMain();
		pm.dbUse();

	}

}



/*SQL�� ó��
1.Connection
2.Statement / PreparedStatement(���ڿ�, ?��밡��)
3.ResultSet
*/