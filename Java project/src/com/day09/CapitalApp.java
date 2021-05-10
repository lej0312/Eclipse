package com.day09;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	static Scanner sc = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<>();

	// 생성자
	public CapitalApp() {
		map.put("한국", "서울");
		map.put("일본", "동경");
		map.put("중국", "베이징");
		map.put("미국", "워싱턴");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("독일", "베를린");
	}

	public static void showMenu() {
		System.out.println("===수도 맞추기 게임===");
		System.out.println("1.입력 2.퀴즈 3.종료>>>");
	}

	public void input() {//맵에 (나라,수도) 추가하기
		int n = map.size();
		System.out.println("현재" + n + "개 나라의 수도 입력");
		while (true) {
			System.out.println("나라,수도 입력 (종료는 x)>>");
			String con = sc.next(); // 나라
			if (con.equalsIgnoreCase("x"))
				break;
			if (map.containsKey(con)) {// 입력한 나라가 맵에 있음
				System.out.println("이미 입력한 나라입니다.");
				continue;
			}
			String capital = sc.next();// 수도 입력
			map.put(con, capital);
		}
	}

	public void quiz() {
		// 키 값만 구하기
		Set<String> set = map.keySet(); // 나라만 있음
		// 구한 키 값만 set 이용해 담기
		Object[] arr = set.toArray(); // 배열로 바꿈
		while (true) {
			int r = (int) (Math.random() * map.size());
			String country = (String) arr[r]; // 문제될 나라 이름
			String sudo = map.get(country); // 정답

			// 문제출제
			System.out.println(country + "의 수도는? (종료는 x)");
			String dap = sc.next();
			if (dap.equalsIgnoreCase("x"))
				break;
			if (sudo.equals(dap)) {
				System.out.println("정답");
			} else {
				System.out.println("틀렸습니다.");
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
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("입력오류");
			}// switch
		} // while
	}// main
}// class
