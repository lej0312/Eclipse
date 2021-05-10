package com.day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.자바 2.데이터베이스 3.안드로이드 4.기타");
		System.out.println("번호선택>>");
		int subject=sc.nextInt();
		if(subject==1) {
			System.out.println("자바공부");
		}else if(subject==2) {
			System.out.println("데이터베이스공부");
		}else if(subject==3) {
			System.out.println("안드로이드공부");
		}else if(subject==4) {
			System.out.println("기타공부");
		}else {
			System.out.println("공부합시다");
		}
		//switch문은 다중if문을 대체 할 수 있다.
		switch(subject) {
		case 1:
			System.out.println("자바공부");
			break;
		case 2:
			System.out.println("데이터베이스공부");
			break;
		case 3:
			System.out.println("안드로이드공부");
			break;
		case 4:
			System.out.println("기타공부");
			break;
		default:System.out.println("공부합시다");
		}
	}

}
