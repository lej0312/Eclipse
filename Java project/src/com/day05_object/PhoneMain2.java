package com.day05_object;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList�̿�
public class PhoneMain2 {
	Scanner sc=new Scanner(System.in);
	//ArrayList alist �����ϱ�
	ArrayList<Phone> alist=new ArrayList<>();
	public void inputPhone() {//�Է� ���� ���
	System.out.println("�Է°���>>");
	int num=sc.nextInt();
	for(int i=0;i<num;i++) {//�̸�,��ȭ��ȣ �Է¹޾� �迭�� �����ϱ�
		System.out.println("�̸�:");
		String name=sc.next();
		System.out.println("��ȭ:");
		String tel=sc.next();
		//arr[i]=new Phone(name,tel); 
		alist.add(new Phone(name,tel));
	}
	}
	public void viewPhone() {
		for(Phone p:alist) {
			System.out.println("�̸�:"+p.getName());
			System.out.println("��ȭ:"+p.getTel());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PhoneMain2 pm=new PhoneMain2();
		pm.inputPhone();
		pm.viewPhone();
		
	
	}

}
