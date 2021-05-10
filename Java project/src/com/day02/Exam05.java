package com.day02;

public class Exam05 {

	public static void main(String[] args) {
		// for 이용 1~5까지 출력
		// 1 2 3 4 5
		for(int i=1;i<6;i++) {
			System.out.println(i+"\t");
		}
		System.out.println();
		
		//while-횟수를 알 수 없을 때 (cf:for횟수를 알 수 있을 때)
		int n=1;
		while(n<6) {
			System.out.println(n+"\t");
			n++;
		}
		System.out.println();
		
		//do~while-무조건 한 번은 실행
		int m=1;
		do {
			System.out.println(m+"\t");
			m++;
		}while(m<6);
		System.out.println();
		System.out.println("=========");
		
		for(int i=1;i<10;i++) {
			if(i==5) break; //if에 걸리는 줄이 한 줄 일때는 중괄호{} 생략 가능
			System.out.println("i="+i);
		}
		
		System.out.println("=========");
	
		for(int i=1;i<10;i++) {
		if(i==5) continue;
		System.out.println("i="+i);	
		}
		
		
			
	}
		
}


