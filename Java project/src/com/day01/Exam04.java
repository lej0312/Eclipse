package com.day01;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[]args) {
		/* 1.������ �Է¹ް� 50 60
		 * 2.ĿƮ������ �Է¹޾� 60 55
		 * 3.�հ����� ���հ������� �˷��ּ���.
		 */
	Scanner scanner=new Scanner(System.in);
	// System.out.println("������ �Է��ϼ���>>");
	// int score=scanner.nextInt();
	// System.out.println("ĿƮ������ �Է��ϼ���>>");
	// int cutline=scanner.nextInt();
	System.out.println("������ ĿƮ������ �Է��ϼ���");
	int score=scanner.nextInt();
	int cutline=scanner.nextInt();
	if(score>=cutline) {
		System.out.println("�հ�");
	}else {
		System.out.println("���հ�");
	}
	
	//������ 3�� ����� �� Ȯ��
	//������ 3�� ����Դϴ�. �ƴϸ� 3�� ����� �ƴմϴ�.
	if(score%3==0) {
		System.out.println("3�� ���");
	}else {
		System.out.println("3�� ��� �ƴ�");
	}
}//main
	
}//class
	

