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

	public PlayerMain() { // 생성자에서 디비셋팅
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
			System.out.println("1.선수등록 2. 선수전체보기 3. 선수 찾기 4. 선수정보 수정  5 선수 탈퇴 6. 종료");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				playerInsert();
			} else if (choice == 2) {
				playerView();
			} else if (choice == 3) {
				System.out.println("찾을 선수 이름>>");
				String name = sc.next();
				playerSearch(name);
			} else if (choice == 4) {
				playerUpdate();
			} else if (choice == 5) {
				playerDelete();
			} else if (choice == 6) {
				playerExit();
			} else {
				System.out.println("입력오류");
			}
		}
	}

	// 4번 수정
	private void playerUpdate() {
		System.out.println("수정할 선수 이름>>");
		String name = sc.next();
		playerSearch(name);
		System.out.println("수정할 선수 번호>>");
		int num = sc.nextInt();
		System.out.println("수정할 내용 1.이름 2.키  3.몸무게 4.종목");
		int changNum = sc.nextInt();
		System.out.println("수정내용>>>");
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
		if (changNum == 1 || changNum == 4) { // 문자
			sql = "update player set " + colName + "='" + content + "' where num=" + num;
		} else { // 숫자
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

	// 5번 탈퇴
	private void playerDelete() {
		/*
		 * 1.탈퇴할 선수의 이름 묻기 
		 * 2.이름에 해당하는 선수의 정보를 보여주고 (playerSearch 메소드에서 처리) 
		 * 3.선수 번호를 입력하고 
		 * 4.그 번호에 해당하는 선수 탈퇴
		 */
		System.out.println("탈퇴할 선수 이름 >>");
		String name = sc.next();
		playerSearch(name);
		System.out.println("탈퇴할 선수 번호 >>");
		int num = sc.nextInt();
		String sql = "delete from player where num=" + num;
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void playerSearch(String name) { // 이름에 해당하는 선수 출력
		String sql = "select * from player where name like '%" + name + "%'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("키 : " + rs.getInt("height"));
				System.out.println("몸무게 : " + rs.getInt("weight"));
				System.out.println("종목 : " + rs.getString("kind"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 6 번 종료
	private void playerExit() {
		System.out.println("프로그램종료");
		System.exit(0);
	}

	private void playerInsert() { // 1.선수등록
		System.out.println("이름 >>");
		String name = sc.nextLine(); // 홍길동
		System.out.println("키 >>");
		int height = sc.nextInt(); // 180
		System.out.println("몸무게 >>"); // 100
		int weight = sc.nextInt();
		sc.nextLine();
		System.out.println("종목 >>"); // 야구
		String kind = sc.nextLine();
		String sql = "insert into player(num, name, height, weight, kind) " + " values(player_seq.nextval, ?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, height);
			ps.setInt(3, weight);
			ps.setString(4, kind);
			ps.executeUpdate(); // sql 문 실행
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void playerView() {// 2.선수 전체보기
		String sql = "select * from player";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("키 : " + rs.getInt("height"));
				System.out.println("몸무게 : " + rs.getInt("weight"));
				System.out.println("종목 : " + rs.getString("kind"));
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



/*SQL문 처리
1.Connection
2.Statement / PreparedStatement(문자열, ?사용가능)
3.ResultSet
*/