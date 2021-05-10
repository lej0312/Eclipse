package com.day08;

import java.util.Scanner;

public class StringExam01 {

	public static void main(String[] args) {
		//split() 이용하여 입력한 문장의 단어와 총 단어 수 출력
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("문장을 입력하세요. 종료는 exit>>");
			String line=sc.nextLine();
			//if(line.equals("exit"))break;
			//if(line.toLowerCase().equals("exit"))break;
			//if(line.toUpperCase().equals("EXIT"))break;
			if(line.equalsIgnoreCase("exit"))break;
			String[]arr=line.split(" ");
			System.out.println("단어수:"+arr.length);
			for(String word :arr) {
				System.out.println("단어:"+word);
			}
		}
			sc.close();
			
			
		}
		
		
	}


