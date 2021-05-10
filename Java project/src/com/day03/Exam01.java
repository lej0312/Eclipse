package com.day03;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 *	*********
		 *	******* 
		 * 	*****
		 * 	***
		 * 	*
		 * 
		 */

		for(int i=9;i>0;i-=2) {
			for(int j=i;j>0;j--) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=9;i>0;i-=2) {
			for(int j=1;j<=1;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(char i='I';i>='A';i--) {
			for(char j='A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
