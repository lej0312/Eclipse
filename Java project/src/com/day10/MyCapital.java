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

	public MyCapital() { // 파일을 읽어서 map 에 추가

		File dir = new File("src\\com\\day10");
		File file = new File(dir, "capital.txt");
		try {
			if (!file.exists()) { // 파일이 없으면
				file.createNewFile();
				return; // 종료의 의미
			}
			Scanner scanner = new Scanner(file);
			// 맵에 추가
			while (scanner.hasNext()) {
				String key = scanner.next();// 나라
				String value = scanner.next();// 수도
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
		System.out.println("===  수도 맞추기 게임 ====");
		System.out.println("1.입력 2.퀴즈 3.저장 및 종료 >>>");
	}

	public void input() { // 입력
		System.out.println("현재" + map.size() + "개 나라와 수도 있음");
		while (true) {
			System.out.println("나라와 수도 입력(종료는 x)>>");
			String country = MyCapital.sc.next(); // 나라
			if (country.toLowerCase().equals("x"))
				break;
			if (map.containsKey(country)) {// 이미 출제된 나라
				System.out.println("이미 입력한 나라입니다.");
				continue;
			}
			String sudo = MyCapital.sc.next();
			map.put(country, sudo);
		}

	}

	public void quiz() { // 퀴즈
		Set<String> set = map.keySet(); // 맵에 있는 나라만 set에 가져옴
		// set을 배열형태로 (순서를 얻기위해-문제 출제)
		Object[] arr = set.toArray();
		while (true) {
			// 난수발생
			int r = (int) (Math.random() * map.size());
			String mon = (String) arr[r]; // 나라이름(문제)
			String dap = map.get(mon); // 수도(정답)

			// 문제출제
			System.out.println(mon + "의 수도는 (종료는 x)>>");
			String result = MyCapital.sc.next(); // 답 입력
			if (result.equalsIgnoreCase("x"))
				break;
			if (result.equals(dap)) {
				System.out.println("정답");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}

	public void save() { // 맵에 있는 내용 파일로 저장
		File dir = new File("src\\com\\day10");
		File file = new File(dir, "capital.txt");

		try {
			FileWriter fw = new FileWriter(file); // 나라와 수도를 내보냄
			Set<String> set = map.keySet(); // 나라만 추출
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next(); // 나라 a b c d
				fw.write(key + " "); // 나라
				fw.write(map.get(key) + "\n"); // 수도
			}
			fw.close();
			System.out.println("종료");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("파일 저장 실패");
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
				System.out.println("입력오류");
			}
		}

	}

}
