package com.day01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[]args) {
		//두 수를 입력받아 5 20
		//큰수
		//작은수
		//두수의 차 (큰수-작은수)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수 입력>>");
		int max=sc.nextInt(); //20 10
		System.out.println("두번째 수 입력>>");
		int min=sc.nextInt(); //10 20
		if(max<min) {
			int tmp=max;
			max=min;
			min=tmp;
		}
		System.out.println("큰수:"+max);
		System.out.println("작은수:"+min);
		System.out.println("차이:"+(max-min));
		
		
		
		/*System.out.println("첫번째 수 입력>>");
		int num1=sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("큰수:"+num1);
			System.out.println("작은수:"+num2);
			System.out.println("차이:"+(num1-num2));
		}else if(num1<num2) {
			
		}
		*/
		
		
		
	}
}
