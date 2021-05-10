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

	// phone.txt를 읽어서 Map에 저장
	private void load() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("src\\com\\day10\\phone.txt")); // 파일에서
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

	// Map에서 찾아서 전화번호 알려주기
	private void search() {
		Scanner keyboard = new Scanner(System.in); // 콘솔창에서
		while (true) {
			System.out.println("찾을 이름(종료:X)>>");
			String sname = keyboard.next();
			if (sname.equalsIgnoreCase("x"))
				break;
//			if(map.containsKey(sname)) {//찾는 이름이 맵에 있음
//				System.out.println(map.get(sname));//전화번호를 알려줌
//			}else {//찾는 이름이 맵에 없음
//				System.out.println("찾는 친구 없음");
//			}
			if (map.get(sname) == null) {
				System.out.println("찾는 친구 없음");
			} else {
				System.out.println(map.get(sname));
			}
		}
		keyboard.close();
	}

	// Map==>file로 내보내기
	private void save() {
		map.put("김자바", "010-8888-9999");
		map.put("이자바", "010-1234-1234");
		FileWriter fw = null;
		try {
			fw = new FileWriter("src\\com\\day10\\phone.txt");
			// 키 값만 추출
			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next(); // 이름
				String value = map.get(key); // 전화번호\
				fw.write(key + " ");
				fw.write(value + "\n"); // \n개행
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
