package com.day02;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//����� �Է��ϴµ� �������� -1
		// �Է��� ���� �հ�� ����� ���Ͻÿ�
		// ��) 10 5 6 9 5 6 7 8 -1
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �Է�(�������� -1) >> ");
		int sum = 0 ;  //�հ�
		 int cnt = 0; 
		while(true) {
			int num = sc.nextInt();
			if(num==-1) break;
			sum += num;
			cnt++;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/cnt);

	}

}
