package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MyCapital {
	static Scanner sc = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<>();

	public MyCapital() { // ������ �о map �� �߰�

		File dir = new File("src\\com\\day10");
		File file = new File(dir, "capital.txt");
		try {
			if (!file.exists()) { // ������ ������
				file.createNewFile();
				return; // ������ �ǹ�
			}
			Scanner scanner = new Scanner(file);
			// �ʿ� �߰�
			while (scanner.hasNext()) {
				String key = scanner.next();// ����
				String value = scanner.next();// ����
				map.put(key, value);
				// map.put(scanner.next(), scanner.next());
			}
			System.out.println(map);
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void showMenu() {
		System.out.println("===  ���� ���߱� ���� ====");
		System.out.println("1.�Է� 2.���� 3.���� �� ���� >>>");
	}

	public void input() { // �Է�
		System.out.println("����" + map.size() + "�� ����� ���� ����");
		while (true) {
			System.out.println("����� ���� �Է�(����� x)>>");
			String country = MyCapital.sc.next(); // ����
			if (country.toLowerCase().equals("x"))
				break;
			if (map.containsKey(country)) {// �̹� ������ ����
				System.out.println("�̹� �Է��� �����Դϴ�.");
				continue;
			}
			String sudo = MyCapital.sc.next();
			map.put(country, sudo);
		}

	}

	public void quiz() { // ����
		Set<String> set = map.keySet(); // �ʿ� �ִ� ���� set�� ������
		// set�� �迭���·� (������ �������-���� ����)
		Object[] arr = set.toArray();
		while (true) {
			// �����߻�
			int r = (int) (Math.random() * map.size());
			String mon = (String) arr[r]; // �����̸�(����)
			String dap = map.get(mon); // ����(����)

			// ��������
			System.out.println(mon + "�� ������ (����� x)>>");
			String result = MyCapital.sc.next(); // �� �Է�
			if (result.equalsIgnoreCase("x"))
				break;
			if (result.equals(dap)) {
				System.out.println("����");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}

	public void save() { // �ʿ� �ִ� ���� ���Ϸ� ����
		File dir = new File("src\\com\\day10");
		File file = new File(dir, "capital.txt");

		try {
			FileWriter fw = new FileWriter(file); // ����� ������ ������
			Set<String> set = map.keySet(); // ���� ����
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next(); // ���� a b c d
				fw.write(key + " "); // ����
				fw.write(map.get(key) + "\n"); // ����
			}
			fw.close();
			System.out.println("����");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyCapital app = new MyCapital();
		while (true) {
			MyCapital.showMenu();
			int choice = MyCapital.sc.nextInt();
			switch (choice) {
			case 1:
				app.input();
				break;
			case 2:
				app.quiz();
				break;
			case 3:
				app.save();
				break;
			default:
				System.out.println("�Է¿���");
			}
		}

	}

}
