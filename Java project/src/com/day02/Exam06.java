package com.day02;

public class Exam06 {

	public static void main(String[] args) {
		//1~10까지의 홀수 합 구하기
		//for if문 사용
		int sum=0;
		for(int i=1;i<11;i++) {
			if(i%2==1) {
				sum+=i;
			}//if
		}//for
		System.out.println("홀수 합:"+sum);
		//1~10까지의 홀수 합 구하기
		//for if문 continue 사용
		int hap=0;
		for(int i=1;i<11;i++) {
			if(i%2!=1) continue;//짝수면 그냥 for 다시 수행
				hap+=i;
		}//for
		System.out.println("홀수 합 continue:"+hap);
		
		
		
	}//main
}//class
