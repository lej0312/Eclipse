package com.day01;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[]args) {
		/* 이름, 국어, 영어, 수학 점수를 입력받아
		학생의 총점과 평균의 출력하기*/
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("이름 입력>>");
	String name=sc.next();
	System.out.println("성적입력(국어, 영어, 수학)>>");
	int kor=sc.nextInt();
	int eng=sc.nextInt();
	int math=sc.nextInt();
	int tot=kor+eng+math;
	float avg=tot/3;
	System.out.println("총점:"+tot);
	System.out.println("평균:"+tot/3);
	System.out.println("평균:"+avg);
	
	
	/*
	 * 평균 90점 이상이면 A학점
	 * 평균 80점 이상이면 B학점
	 * 평균 70점 이상이면 C학점
	 * 나머지 F학점
	 */
	// 이름:학점
	String grade="";
	/*if (avg>=90) {
		grade="A학점";
	}else if(avg>=80) {
		grade="B학점";	
	}else if(avg>=70) {
		grade="C학점";	
	}else {
		grade="F학점";
	}*/
	
	// switch
	switch((int)avg/10){
	case 10:
	case 9:grade="A"; break;
	case 8:grade="B"; break;
	case 7:grade="C"; break;
	default:grade="F"; 
	}
	
	System.out.println(name+":"+grade);
	}
}

