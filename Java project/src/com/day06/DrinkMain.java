package com.day06;

import java.util.Scanner;

//�迭�̿�
public class DrinkMain {
	Scanner sc = new Scanner(System.in);
	// �� 5���� ����(�̸�, ����) �Է�
	// arr �̶�� �迭�� ����
	private Drink[] arr = new Drink[3];

	public void inputData() {
		for (int i = 0; i < arr.length; i++) { // while(alist.size()<5
			System.out.println("���� �̸� >>");
			String name = sc.nextLine(); // sc.next()=>���ڿ� �Է�
			System.out.println("���� ����>>");
			int price = sc.nextInt();
			sc.nextLine();
			arr[i] = new Drink(name, price);
		}

	}

	// �԰�� ���� �̸�, ���� ���
	// �԰�� ������ �� �ݾ� ���
	public void viewData() {
		int sum = 0;
		for (Drink d : arr) {
			System.out.println("�̸� : " + d.getName());
			System.out.println("���� :" + d.getPrice());
			System.out.println();
			sum += d.getPrice();
		}
		System.out.println("�ѱݾ� : " + sum);
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�̸� : " + arr[i].getName());
			System.out.println("���� :" + arr[i].getPrice());
			System.out.println();
			hap += arr[i].getPrice();
		}
		System.out.println("�ѱݾ�hap : " + hap);

	}

	public int search() {
		System.out.println("ã�� ���� �̸� >>");
		String searchName = sc.next(); // Ŀ��
		for (int i = 0; i < arr.length; i++) {
			if (searchName.equals(arr[i].getName())) { // ������ ������
				return arr[i].getPrice();
			}
		}
		return 0;
	}

	public Drink drinkSearch() {
		System.out.println("search ���� �̸� >>");
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
