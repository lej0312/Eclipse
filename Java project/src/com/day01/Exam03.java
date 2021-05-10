package com.day01;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[]args) {
		//입력한 수가 짝수인지 홀수인지를 출력하세요
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요>>");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+":짝수");
		}else{
			System.out.println(num+":홀수");
		}
		System.out.println("이름을 입력하세요>>");
		String name=sc.next();
		System.out.println("이름:"+name);
		//나이를 입력받아 나이가 20이상이면 입장가능
		//15세 이상 20미만이면 부모님과 동반입장
		//15세 미만이면 입장 불가능
		System.out.println("나이를 입력하세요>>");
		int age=sc.nextInt();
		if(age>=20) {
			System.out.println("입장가능");
		}else if(age>=15) {
			System.out.println("부모님과 동반입장");
		}else{
			System.out.println("입장 불가능");
		}
		sc.close();
			
		}
		
		
	
	}

