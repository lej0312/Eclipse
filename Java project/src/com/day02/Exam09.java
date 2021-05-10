package com.day02;

public class Exam09 {

	public static void main(String[] args) {
		/*
		 * 2*1=2 3*1=3 4*1=4...9*1=9
		 * 
		 * 
		 * 2*9=18.............9*9=81
		 */
		for(int i=1;i<10;i++) {
			for(int d=2;d<10;d++) {
				System.out.println(d+"*"+i+"="+d*i+"\t");
			}
			System.out.println();
		}
		/*
		 *	*******(7)
		 * 	*****(5)
		 * 	***(3)
		 * 	*(1)
		 */
		
		for(int i=7;i>0;i-=2) {
			for(int j=0;j<i;j++) {//7 5 3 1
				System.out.println("*");
			}
			System.out.println("("+i+")");
		}	
		System.out.println("=============");
		for(int i=7; i>0; i-=2) {
			for(int j=i;j>0;j--) {//7 5 3 1
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
