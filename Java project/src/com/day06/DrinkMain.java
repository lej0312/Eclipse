package com.day06;

import java.util.Scanner;

//배열이용
public class DrinkMain {
	Scanner sc = new Scanner(System.in);
	// 총 5개의 음료(이름, 가격) 입력
	// arr 이라는 배열에 저장
	private Drink[] arr = new Drink[3];

	public void inputData() {
		for (int i = 0; i < arr.length; i++) { // while(alist.size()<5
			System.out.println("음료 이름 >>");
			String name = sc.nextLine(); // sc.next()=>문자열 입력
			System.out.println("음료 가격>>");
			int price = sc.nextInt();
			sc.nextLine();
			arr[i] = new Drink(name, price);
		}

	}

	// 입고된 음료 이름, 가격 출력
	// 입고된 음료의 총 금액 출력
	public void viewData() {
		int sum = 0;
		for (Drink d : arr) {
			System.out.println("이름 : " + d.getName());
			System.out.println("가격 :" + d.getPrice());
			System.out.println();
			sum += d.getPrice();
		}
		System.out.println("총금액 : " + sum);
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름 : " + arr[i].getName());
			System.out.println("가격 :" + arr[i].getPrice());
			System.out.println();
			hap += arr[i].getPrice();
		}
		System.out.println("총금액hap : " + hap);

	}

	public int search() {
		System.out.println("찾는 음료 이름 >>");
		String searchName = sc.next(); // 커피
		for (int i = 0; i < arr.length; i++) {
			if (searchName.equals(arr[i].getName())) { // 내용이 같은지
				return arr[i].getPrice();
			}
		}
		return 0;
	}

	public Drink drinkSearch() {
		System.out.println("search 음료 이름 >>");
		String sname = sc.next();
		for (int i = 0; i < arr.length; i++) {
			if (sname.equals(arr[i].getName())) {
				return arr[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		DrinkMain dm = new DrinkMain();
		dm.inputData(); // 음료판매
		dm.viewData(); // 판매리스트
		System.out.println("찾는 음료 가격>>" + dm.search());
		Drink d = dm.drinkSearch();
		if (d == null) {
			System.out.println("search price : 찾는 음료 없음");
		} else {
			System.out.println("search price : " + d.getPrice());
		}
		// 삼항연산자
		System.out.println("search price : " + (d == null ? 0 : d.getPrice()));

	}

}
