package com.day01;

public class Exam10 {
	public static void main(String[] args) {
		//자바 기본데이터 형 8가지
		int a; //4바이트
		long c=1000000000000000000L;//8바이트
		//실수
		float f; //4바이트
		double b; //8바이트
		
		//boolean b =true; //true,false (원래초록색아님 오류나서 주석처리)
		char ch='a'; //문자 하나 (2바이트로 홑따옴표)
		// char ch1="A";
		
		byte bb; //1byte
		short sh; //2byte
//----------------------------
		
		String str="";
		int aa=10;
		/*if(a==10) {
			str="10이다";
		}else {
			str="10아님";
		}*/
		//삼항연산자(조건연산자)표현
		str=(aa==10)?"10이다":"10아님";
		System.out.println(str);
	}

}
