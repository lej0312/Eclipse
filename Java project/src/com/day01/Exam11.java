package com.day01;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		/*
		 * 1~99 ���� ���� �ϳ� �Է¹޾�
		 * �ʴ��� 3,6,9 �˻�
		 * �ϴ��� 3,6,9 �˻�
		 * 3,6,9�� 2���̸� �ڼ�¦¦
		 * 3,6,9�� 1���̸� �ڼ�¦
		 * ������ �ڼ�����
		 * ��)36->�ڼ�¦¦
		 * 	 46->�ڼ�¦
		 * 	 52->�ڼ�����
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("1~99���� ���� ��������");
		int su=sc.nextInt(); //69
		int a=su/10; //�ʴ��� -->6
		int b=su%10; //�ϴ��� -->9
		int cnt=0; //3,6,9 ����
		// ==���� !=�ٸ��� &&and ||or
		
		if(a%3==0&&a!=0) {//�ʴ��� (3���� ������ �������� 0�� �ƴϾ�� ��)
			cnt++; //cnt=cnt+1
		}
		if(b%3==0&&b!=0) {//�ϴ���
			cnt++; //cnt+=1
		}
		if(cnt==2) {
			System.out.println("�ڼ�¦¦");
		}else if(cnt==1) {
			System.out.println("�ڼ�¦");
		}else {
			System.out.println("�ڼ�����");
		}
		
	}

}
