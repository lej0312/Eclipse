package com.day10;

public class Exception02  {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NullPointerException{
		String[] msg= {"one","two","three"};
		String str = null;
		System.out.println(str.length());
		for(int i =0 ; i<10; i++) {
			System.out.println(msg[i]);
		}

	}

}
