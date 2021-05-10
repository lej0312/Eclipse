package com.day02;

public class Exam08 {
	
	public static void main(String[] args) {
		/*
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * 
		 * 3*1=3
		 * 3*2=6
		 * 3*3=9
		 * 
		 * 4*1=4
		 * 4*2=8
		 * 4*3=12
		 */
		for(int d=2;d<5;d++) {//d=2
			for(int i=1;i<4;i++) {//i=1 2 3
				System.out.println(d+"*"+i+"="+d*i);
			}//i
			System.out.println();
		}//d
		System.out.println("===========");
		/*
		 * 3단
		 * 3*1=3
		 * 
		 * 5단
		 * 5*1=5
		 * 
		 * 7단
		 * 7*1=7
		 */
		for(int i=3;i<8;i+=2) {//3 5 7
			//if(i%2==0) continue;
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {//1~9 1~9 1~9
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		/*
		 * 123456789 ->j
		 * 12345678
		 * 1234567
		 * ....
		 * 1
		 */
		for(int i=9;i>0;i--) {//9 8 7 6...1
			for(int j=1;j<=i;j++) {
				System.out.println(j);				
			}
			System.out.println();
		}
		
		/*
		 * 1~10까지의 합 55
		 * 11~20까지의 합 155
		 * 21~30까지의 합
		 * ......
		 * 91~100까지의 합 955
		 * Exam04와 비교해보기
		 */
		//이중 for 사용해서 출력
		
		for(int k=1;k<=100;k+=10) {//k=1,11,21,31
			int sum=0;
			int i;
				for(i=k;i<k+10;i++) {//1,10 11,20 21,30
					sum += i;
				}
				System.out.println(k+"부터"+(i-1)+"까지의 합:"+sum);
			}
		
			
	}//main

}//class
