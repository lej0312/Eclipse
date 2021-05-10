package com.day01;

public class Exam02 {
	public static void main(String[]args) {
		//a 변수에 49할당
		int a=49;
		//a가 50보다 큽니까? 
		//크면 50보다 크다 작으면 50보다 작다
		
		//조건문 =>true/false
		if(a>50){
			System.out.print("50보다 크다"); //true
		}else{ //false
			System.out.print("50보다 작다");
		}
		//a가 짝수인지 홀수인지 출력
		if(a%2==0){
			System.out.print("짝수");
		}else{
			System.out.print("홀수");
		}
		
		a=51; //50 100 200
		if(a>50){
			System.out.print("50보다 크다");
		}else if(a>100) {
			System.out.print("100보다 크다");
		}else if(a>200) {
			System.out.print("2000보다 크다");
		}else {
			System.out.println("else");
		}
		System.out.println();
		a=202;
		if(a>50){
			System.out.print("50보다 크다");
		}if(a>100) {
			System.out.print("100보다 크다");
		}if(a>200) {
			System.out.print("2000보다 크다");
		}else {
			System.out.println("else");
		}
		System.out.println();
		
	}
}
