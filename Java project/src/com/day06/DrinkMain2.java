package com.day06;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList alist �̿�
public class DrinkMain2 {
	Scanner sc = new Scanner(System.in);
	// private Drink[] arr = new Drink[5];
	ArrayList<Drink> alist = new ArrayList<>();

	public void inputData() {
		for (int i = 0; i < 3; i++) { // while(alist.size() < 5)
			System.out.println("���� �̸� >>");
			String name = sc.nextLine(); // sc.next()
			System.out.println("���� ����>>");
			int price = sc.nextInt();
			sc.nextLine();
			alist.add(new Drink(name, price));
		}

	}

	// �԰�� ���� �̸�, ���� ���
	// �԰�� ������ �� �ݾ� ���
	public void viewData() {
		int sum = 0;
		for (Drink d : alist) {
			System.out.println("�̸� : " + d.getName());
			System.out.println("���� :" + d.getPrice());
			System.out.println();
			sum += d.getPrice();
		}
		System.out.println("�ѱݾ� : " + sum);
		int hap = 0;
		for (int i = 0; i < alist.size(); i++) {
			System.out.println("�̸� : " + alist.get(i).getName());
			System.out.println("���� :" + alist.get(i).getPrice());
			System.out.println();
			hap += alist.get(i).getPrice();
		}
		System.out.println("�ѱݾ�hap : " + hap);

	}

	private int search() {
		System.out.println("ã�� ���� >>");
		String searchName = sc.next();
		for (int i = 0; i < alist.size(); i++) {
			if (searchName.equals(alist.get(i).getName())) {
				return alist.get(i).getPrice();
			}
		}
		return 0;

	}

	private Drink drinkSearch() { // *Drink�� nullüũ
		System.out.println("search   ���� >>");
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
		dm.inputData(); // �����Ǹ�
		dm.viewData(); // �ǸŸ���Ʈ
		System.out.println("ã�� ���� ����>>" + dm.search());
		Drink d = dm.drinkSearch();
		if (d == null) {
			System.out.println("search price : ã�� ���� ����");
		} else {
			System.out.println("search price : " + d.getPrice());
		}
		// ���׿�����
		System.out.println("search price : " + (d == null ? 0 : d.getPrice()));
	}

}
