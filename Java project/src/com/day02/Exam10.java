package com.day02;

public class Exam10 {

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
		
		
		
	}

}
