package com.day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 몇 개 입력받을지 물어보고
		 * 그 수만큼 숫자를 입력하여
		 * 그 수들의 합계 출력
		 * day02.exam03과 비교
		 * 입력한 수 출력하기
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("입력할 갯수를 입력하세요");
		int cnt=sc.nextInt();
		int sum=0;
		for(int i=0;i<cnt;i++) {
			int num=sc.nextInt();
		//	System.out.print(num+"\t"); ->이 자리에 넣으면 입력한 수 출력 가능 하지만 원하는 자리가 아님
			sum += num;//
		}
		System.out.println("입력합계:"+sum);
		//입력한 수 출력(1)
		
		//입력한 수 출력(2)
		System.out.println("입력할 갯수를 입력하세요");
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
		System.out.println("입력합계:"+sum1);
		
		for(int i=0;i<tmp.length;i++) {
		System.out.println(tmp[i]);
		}
		//입력값 중에서 최대값 출력
		System.out.println("최대값:"+max);
		
	}
}
