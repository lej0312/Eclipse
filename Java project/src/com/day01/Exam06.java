package com.day01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[]args) {
		//�� ���� �Է¹޾� 5 20
		//ū��
		//������
		//�μ��� �� (ū��-������)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° �� �Է�>>");
		int max=sc.nextInt(); //20 10
		System.out.println("�ι�° �� �Է�>>");
		int min=sc.nextInt(); //10 20
		if(max<min) {
			int tmp=max;
			max=min;
			min=tmp;
		}
		System.out.println("ū��:"+max);
		System.out.println("������:"+min);
		System.out.println("����:"+(max-min));
		
		
		
		/*System.out.println("ù��° �� �Է�>>");
		int num1=sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("ū��:"+num1);
			System.out.println("������:"+num2);
			System.out.println("����:"+(num1-num2));
		}else if(num1<num2) {
			
		}
		*/
		
		
		
	}
}
