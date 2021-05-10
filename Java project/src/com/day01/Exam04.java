package com.day01;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[]args) {
		/* 1.점수를 입력받고 50 60
		 * 2.커트라인을 입력받아 60 55
		 * 3.합격인지 불합격인지를 알려주세요.
		 */
	Scanner scanner=new Scanner(System.in);
	// System.out.println("점수를 입력하세요>>");
	// int score=scanner.nextInt();
	// System.out.println("커트라인을 입력하세요>>");
	// int cutline=scanner.nextInt();
	System.out.println("점수와 커트라인을 입력하세요");
	int score=scanner.nextInt();
	int cutline=scanner.nextInt();
	if(score>=cutline) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	//점수가 3의 배수인 지 확인
	//맞으면 3의 배수입니다. 아니면 3의 배수가 아닙니다.
	if(score%3==0) {
		System.out.println("3의 배수");
	}else {
		System.out.println("3의 배수 아님");
	}
}//main
	
}//class
	

