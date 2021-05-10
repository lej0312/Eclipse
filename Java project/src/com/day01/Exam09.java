package com.day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 10 5 + ==>15
		// 10 5 * ==>50
		//switch 문으로 두 수와 연산자를 입력받아
		//세번째 연산자로 연산하여 결과출력
		
		Scanner sc=new Scanner(System.in);
		System.out.println("두 수와 연산자를 입력하세요>>");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String op=sc.next();
		switch(op) {//연산자에 따라
		case "+":System.out.println(n1+n2); break;
		case "-":System.out.println(n1-n2); break;
		case "*":System.out.println(n1*n2); break;
		case "/":System.out.println(n1/n2); break;
		case "%":System.out.println(n1%n2); break;
		default :System.out.println("연산자 입력 오류");
		}
		
		
	}

}
