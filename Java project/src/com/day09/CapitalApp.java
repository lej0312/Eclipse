package com.day09;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	static Scanner sc = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<>();

	// ������
	public CapitalApp() {
		map.put("�ѱ�", "����");
		map.put("�Ϻ�", "����");
		map.put("�߱�", "����¡");
		map.put("�̱�", "������");
		map.put("����", "����");
		map.put("������", "�ĸ�");
		map.put("����", "������");
	}

	public static void showMenu() {
		System.out.println("===���� ���߱� ����===");
		System.out.println("1.�Է� 2.���� 3.����>>>");
	}

	public void input() {//�ʿ� (����,����) �߰��ϱ�
		int n = map.size();
		System.out.println("����" + n + "�� ������ ���� �Է�");
		while (true) {
			System.out.println("����,���� �Է� (����� x)>>");
			String con = sc.next(); // ����
			if (con.equalsIgnoreCase("x"))
				break;
			if (map.containsKey(con)) {// �Է��� ���� �ʿ� ����
				System.out.println("�̹� �Է��� �����Դϴ�.");
				continue;
			}
			String capital = sc.next();// ���� �Է�
			map.put(con, capital);
		}
	}

	public void quiz() {
		// Ű ���� ���ϱ�
		Set<String> set = map.keySet(); // ���� ����
		// ���� Ű ���� set �̿��� ���
		Object[] arr = set.toArray(); // �迭�� �ٲ�
		while (true) {
			int r = (int) (Math.random() * map.size());
			String country = (String) arr[r]; // ������ ���� �̸�
			String sudo = map.get(country); // ����

			// ��������
			System.out.println(country + "�� ������? (����� x)");
			String dap = sc.next();
			if (dap.equalsIgnoreCase("x"))
				break;
			if (sudo.equals(dap)) {
				System.out.println("����");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		CapitalApp ca = new CapitalApp();
		while (true) {
			CapitalApp.showMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ca.input();
				break;
			case 2:
				ca.quiz();
				break;
			case 3:
				System.out.println("����");
				System.exit(0);
			default:
				System.out.println("�Է¿���");
			}// switch
		} // while
	}// main
}// class
