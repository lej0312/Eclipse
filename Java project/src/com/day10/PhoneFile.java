package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneFile {
	private HashMap<String, String> map = new HashMap<>();

	// phone.txt�� �о Map�� ����
	private void load() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("src\\com\\day10\\phone.txt")); // ���Ͽ���
			while (sc.hasNext()) {
				String name = sc.next();
				String phoneNum = sc.next();
				map.put(name, phoneNum);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println(map);
	}

	// Map���� ã�Ƽ� ��ȭ��ȣ �˷��ֱ�
	private void search() {
		Scanner keyboard = new Scanner(System.in); // �ܼ�â����
		while (true) {
			System.out.println("ã�� �̸�(����:X)>>");
			String sname = keyboard.next();
			if (sname.equalsIgnoreCase("x"))
				break;
//			if(map.containsKey(sname)) {//ã�� �̸��� �ʿ� ����
//				System.out.println(map.get(sname));//��ȭ��ȣ�� �˷���
//			}else {//ã�� �̸��� �ʿ� ����
//				System.out.println("ã�� ģ�� ����");
//			}
			if (map.get(sname) == null) {
				System.out.println("ã�� ģ�� ����");
			} else {
				System.out.println(map.get(sname));
			}
		}
		keyboard.close();
	}

	// Map==>file�� ��������
	private void save() {
		map.put("���ڹ�", "010-8888-9999");
		map.put("���ڹ�", "010-1234-1234");
		FileWriter fw = null;
		try {
			fw = new FileWriter("src\\com\\day10\\phone.txt");
			// Ű ���� ����
			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next(); // �̸�
				String value = map.get(key); // ��ȭ��ȣ\
				fw.write(key + " ");
				fw.write(value + "\n"); // \n����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		PhoneFile phone = new PhoneFile();
		phone.load();
		phone.search();
		phone.save();
	}

}
