package com.day02;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//양수를 입력하는데 마지막은 -1
		// 입력한 수의 합계와 평균을 구하시오
		// 예) 10 5 6 9 5 6 7 8 -1
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 입력(마지막은 -1) >> ");
		int sum = 0 ;  //합계
		 int cnt = 0; 
		while(true) {
			int num = sc.nextInt();
			if(num==-1) break;
			sum += num;
			cnt++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/cnt);

	}

}
