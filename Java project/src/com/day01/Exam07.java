package com.day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.�ڹ� 2.�����ͺ��̽� 3.�ȵ���̵� 4.��Ÿ");
		System.out.println("��ȣ����>>");
		int subject=sc.nextInt();
		if(subject==1) {
			System.out.println("�ڹٰ���");
		}else if(subject==2) {
			System.out.println("�����ͺ��̽�����");
		}else if(subject==3) {
			System.out.println("�ȵ���̵����");
		}else if(subject==4) {
			System.out.println("��Ÿ����");
		}else {
			System.out.println("�����սô�");
		}
		//switch���� ����if���� ��ü �� �� �ִ�.
		switch(subject) {
		case 1:
			System.out.println("�ڹٰ���");
			break;
		case 2:
			System.out.println("�����ͺ��̽�����");
			break;
		case 3:
			System.out.println("�ȵ���̵����");
			break;
		case 4:
			System.out.println("��Ÿ����");
			break;
		default:System.out.println("�����սô�");
		}
	}

}
