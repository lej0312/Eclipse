package com.day01;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		/*
		 * 1~99 사이 정수 하나 입력받아
		 * 십단위 3,6,9 검사
		 * 일단위 3,6,9 검사
		 * 3,6,9가 2개이면 박수짝짝
		 * 3,6,9가 1개이면 박수짝
		 * 없으면 박수없음
		 * 예)36->박수짝짝
		 * 	 46->박수짝
		 * 	 52->박수없음
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("1~99사이 정수 넣으세요");
		int su=sc.nextInt(); //69
		int a=su/10; //십단위 -->6
		int b=su%10; //일단위 -->9
		int cnt=0; //3,6,9 갯수
		// ==같다 !=다르다 &&and ||or
		
		if(a%3==0&&a!=0) {//십단위 (3으로 나누어 떨어지고 0이 아니어야 함)
			cnt++; //cnt=cnt+1
		}
		if(b%3==0&&b!=0) {//일단위
			cnt++; //cnt+=1
		}
		if(cnt==2) {
			System.out.println("박수짝짝");
		}else if(cnt==1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}
		
	}

}
