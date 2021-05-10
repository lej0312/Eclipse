package com.day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 몇 개 입력받을 지 물어보고 ->5
		 * 그 수만큼 숫자를 입력하여 ->10 3 5 8 7
		 * 그 수들의 합계 출력 ->??
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("입력할 갯수를 입력하세요");
		int num=sc.nextInt();//5 6 7
		System.out.println("데이터 입력>>");
		int sum=0;
		for(int i=0;i<num;i++) {
			//int intData=sc.nextInt();
			//sum += intData;	
			sum +=sc.nextInt();
		}
		System.out.println("입력합계:"+sum);
		/*
		 * 1~10까지의 합 55
		 * 1~20까지의 합
		 * 1~30까지의 합
		 * ......
		 * 1~100까지의 합 5050
		 */
		int hap=0;
		for(int i=1;i<=100;i++) {
			hap += i;
			if(i%10==0) {//10번 출력조건
				System.out.println("1부터"+i+"까지의 합"+hap);
			}
		}
		//1+2+3+...+9+10=55 형태로 출력
		//방법1
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
		//방법2
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

