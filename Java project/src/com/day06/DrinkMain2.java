package com.day06;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList alist 이용
public class DrinkMain2 {
	Scanner sc = new Scanner(System.in);
	// private Drink[] arr = new Drink[5];
	ArrayList<Drink> alist = new ArrayList<>();

	public void inputData() {
		for (int i = 0; i < 3; i++) { // while(alist.size() < 5)
			System.out.println("음료 이름 >>");
			String name = sc.nextLine(); // sc.next()
			System.out.println("음료 가격>>");
			int price = sc.nextInt();
			sc.nextLine();
			alist.add(new Drink(name, price));
		}

	}

	// 입고된 음료 이름, 가격 출력
	// 입고된 음료의 총 금액 출력
	public void viewData() {
		int sum = 0;
		for (Drink d : alist) {
			System.out.println("이름 : " + d.getName());
			System.out.println("가격 :" + d.getPrice());
			System.out.println();
			sum += d.getPrice();
		}
		System.out.println("총금액 : " + sum);
		int hap = 0;
		for (int i = 0; i < alist.size(); i++) {
			System.out.println("이름 : " + alist.get(i).getName());
			System.out.println("가격 :" + alist.get(i).getPrice());
			System.out.println();
			hap += alist.get(i).getPrice();
		}
		System.out.println("총금액hap : " + hap);

	}

	private int search() {
		System.out.println("찾는 음료 >>");
		String searchName = sc.next();
		for (int i = 0; i < alist.size(); i++) {
			if (searchName.equals(alist.get(i).getName())) {
				return alist.get(i).getPrice();
			}
		}
		return 0;

	}

	private Drink drinkSearch() { // *Drink와 null체크
		System.out.println("search   음료 >>");
		String sname = sc.next();
		for (int i = 0; i < alist.size(); i++) {
			if (sname.equals(alist.get(i).getName())) {
				return alist.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		DrinkMain2 dm = new DrinkMain2();
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
