package com.day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 10 5 + ==>15
		// 10 5 * ==>50
		//switch ������ �� ���� �����ڸ� �Է¹޾�
		//����° �����ڷ� �����Ͽ� ������
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�� ���� �����ڸ� �Է��ϼ���>>");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String op=sc.next();
		switch(op) {//�����ڿ� ����
		case "+":System.out.println(n1+n2); break;
		case "-":System.out.println(n1-n2); break;
		case "*":System.out.println(n1*n2); break;
		case "/":System.out.println(n1/n2); break;
		case "%":System.out.println(n1%n2); break;
		default :System.out.println("������ �Է� ����");
		}
		
		
	}

}
