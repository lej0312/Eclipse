package com.day01;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[]args) {
		//�Է��� ���� ¦������ Ȧ�������� ����ϼ���
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���>>");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+":¦��");
		}else{
			System.out.println(num+":Ȧ��");
		}
		System.out.println("�̸��� �Է��ϼ���>>");
		String name=sc.next();
		System.out.println("�̸�:"+name);
		//���̸� �Է¹޾� ���̰� 20�̻��̸� ���尡��
		//15�� �̻� 20�̸��̸� �θ�԰� ��������
		//15�� �̸��̸� ���� �Ұ���
		System.out.println("���̸� �Է��ϼ���>>");
		int age=sc.nextInt();
		if(age>=20) {
			System.out.println("���尡��");
		}else if(age>=15) {
			System.out.println("�θ�԰� ��������");
		}else{
			System.out.println("���� �Ұ���");
		}
		sc.close();
			
		}
		
		
	
	}

