package com.day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 단을 입력받아서
		 * 입력받은 단의 구구단 출력
		 * 구구단 합계 출력
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("단 입력>>");
		int dan=sc.nextInt();
		int tot=0;
		for(int i=1;i<10;i++) {
			tot +=dan*i;//tot=tot+dan*i
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		System.out.println("구구단 합계:"+tot);
		//1부터 10까지의 합계
		int sum=0; //sum=0 (위치 중요)
		for(int i=1;i<=10;i++) {//i=1 2 3 4
			sum=sum+i; //sum=0+1 1+2 3+3 6+4
		}
		System.out.println("sum:"+sum);
		System.out.println("-------------------");
		//1부터 50까지의 짝수 합 출력
		int hap=0;
		for (int i=1;i<51;i++) {
			if(i%2==0) {
				hap=hap+i;
			}//if
		}//for
		System.out.println("결과:"+hap);
		System.out.println("-------------------");
		int h=0;
		for(int i=2;i<51;i+=2) {
			h=h+i;
		}
		System.out.println("결과:"+h);
		
		}
	}
			


