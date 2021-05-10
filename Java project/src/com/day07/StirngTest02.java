package com.day07;

public class StirngTest02 {

	public static void main(String[] args) { //***함수체크
	String str="안녕하세요 Hello 지금은 자바공부!!!!!";
	System.out.println("str 길이:"+str.length()); 
	System.out.println("H의 위치:"+str.indexOf("H"));
	System.out.println("H의 위치:"+str.indexOf("Hello"));
	System.out.println("4번째 문자:"+str.charAt(4));
	String tmp="열심히 합시다";
	System.out.println("str과 tmp 연결"+str+tmp);
	System.out.println("str과 tmp 연결"+str.concat(tmp));
	int value=7;
	//str과 value를 연결
	System.out.println("str과 tmp 연결"+str+value);
	System.out.println("str과 tmp 연결"+str.concat(value+""));
	//int==String 변환
	String s=String.valueOf(value);
	System.out.println("str과 tmp 연결"+str.concat(s));
	System.out.println("str과 tmp 연결"+str.concat(String.valueOf(value)));
	String tmp2="jgnfdjgks gkmkdhm fmkadngjh";
	System.out.println("tmp2:"+tmp2);
	System.out.println("tmp2 대문자:"+tmp2.toUpperCase());
	System.out.println("tmp2 소문자:"+tmp2.toUpperCase().toLowerCase());
	//tmp2 문자열의 길이
	System.out.println("tmp2 길이:"+tmp2.length());
	//tmp2 문자열의 마지막 문자
	System.out.println("tmp2 문자열의 마지막 문자:"+tmp2.charAt(tmp2.length()-1));
	System.out.println(tmp2.lastIndexOf('d'));
	
	
	}
}
