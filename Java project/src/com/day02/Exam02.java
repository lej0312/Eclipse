package com.day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * ���� �Է¹޾Ƽ�
		 * �Է¹��� ���� ������ ���
		 * ������ �հ� ���
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("�� �Է�>>");
		int dan=sc.nextInt();
		int tot=0;
		for(int i=1;i<10;i++) {
			tot +=dan*i;//tot=tot+dan*i
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		System.out.println("������ �հ�:"+tot);
		//1���� 10������ �հ�
		int sum=0; //sum=0 (��ġ �߿�)
		for(int i=1;i<=10;i++) {//i=1 2 3 4
			sum=sum+i; //sum=0+1 1+2 3+3 6+4
		}
		System.out.println("sum:"+sum);
		System.out.println("-------------------");
		//1���� 50������ ¦�� �� ���
		int hap=0;
		for (int i=1;i<51;i++) {
			if(i%2==0) {
				hap=hap+i;
			}//if
		}//for
		System.out.println("���:"+hap);
		System.out.println("-------------------");
		int h=0;
		for(int i=2;i<51;i+=2) {
			h=h+i;
		}
		System.out.println("���:"+h);
		
		}
	}
			


