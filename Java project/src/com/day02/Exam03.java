package com.day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * �� �� �Է¹��� �� ����� ->5
		 * �� ����ŭ ���ڸ� �Է��Ͽ� ->10 3 5 8 7
		 * �� ������ �հ� ��� ->??
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է��� ������ �Է��ϼ���");
		int num=sc.nextInt();//5 6 7
		System.out.println("������ �Է�>>");
		int sum=0;
		for(int i=0;i<num;i++) {
			//int intData=sc.nextInt();
			//sum += intData;	
			sum +=sc.nextInt();
		}
		System.out.println("�Է��հ�:"+sum);
		/*
		 * 1~10������ �� 55
		 * 1~20������ ��
		 * 1~30������ ��
		 * ......
		 * 1~100������ �� 5050
		 */
		int hap=0;
		for(int i=1;i<=100;i++) {
			hap += i;
			if(i%10==0) {//10�� �������
				System.out.println("1����"+i+"������ ��"+hap);
			}
		}
		//1+2+3+...+9+10=55 ���·� ���
		//���1
		int tenSum=0;
		for(int i=1;i<11;i++) {
			tenSum +=i;
			if(i!=10) {
				System.out.println(i+"+");
			}else {
				System.out.println(i+"=");
			}
		}
		System.out.println(tenSum);
		System.out.println("======");
		//���2
		int tSum=0;
		for(int i=1;i<11;i++) {
			tSum +=i;
			if(i==1) {
				System.out.println(i);
			}else {
				System.out.println("+"+i);
			}
		}
		System.out.println("="+tSum);

	
	
	}
	
			
		
	}

