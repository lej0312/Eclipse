package com.day05_object;

import java.util.Scanner;

//�迭�̿�
public class PhoneMain {
	Scanner sc=new Scanner(System.in);
	Phone[]arr;//����
	public void inputPhone() {//�Է� ���� ���
	System.out.println("�Է°���>>");
	int num=sc.nextInt();
	arr=new Phone[num]; //new==>����
	//�̸�,��ȭ��ȣ �Է¹޾� �迭�� �����ϱ�
	for(int i=0;i<arr.length;i++) {
		System.out.println("�̸�:");
		String name=sc.next();
		System.out.println("��ȭ:");
		String tel=sc.next();
		//arr[i]=new Phone(name,tel); //�Ʒ� �� �ٰ� ����
		arr[i]=new Phone();
		arr[i].setName(name);
		arr[i].setTel(tel);
	}
	
	
	}
	public void viewPhone() {
		for(Phone p:arr) {
			System.out.println("�̸�:"+p.getName());
			System.out.println("��ȭ:"+p.getTel());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PhoneMain pm=new PhoneMain();
		pm.inputPhone();
		pm.viewPhone();
		
		
		
		
		

	}

}
