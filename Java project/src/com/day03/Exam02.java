package com.day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * �� �� �Է¹����� �����
		 * �� ����ŭ ���ڸ� �Է��Ͽ�
		 * �� ������ �հ� ���
		 * day02.exam03�� ��
		 * �Է��� �� ����ϱ�
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է��� ������ �Է��ϼ���");
		int cnt=sc.nextInt();
		int sum=0;
		for(int i=0;i<cnt;i++) {
			int num=sc.nextInt();
		//	System.out.print(num+"\t"); ->�� �ڸ��� ������ �Է��� �� ��� ���� ������ ���ϴ� �ڸ��� �ƴ�
			sum += num;//
		}
		System.out.println("�Է��հ�:"+sum);
		//�Է��� �� ���(1)
		
		//�Է��� �� ���(2)
		System.out.println("�Է��� ������ �Է��ϼ���");
		int cnt1=sc.nextInt();
		int sum1=0;
		
		int[] tmp=new int[cnt1];
		int max=tmp[0];
		for(int i=0;i<cnt1;i++) {
			tmp[i]=sc.nextInt();
			sum1 += tmp[i];
			if(max < tmp[i]) {
				max=tmp[i];
			}
		}
		System.out.println("�Է��հ�:"+sum1);
		
		for(int i=0;i<tmp.length;i++) {
		System.out.println(tmp[i]);
		}
		//�Է°� �߿��� �ִ밪 ���
		System.out.println("�ִ밪:"+max);
		
	}
}
