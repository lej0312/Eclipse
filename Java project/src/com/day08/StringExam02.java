package com.day08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExam02 {

	public static void main(String[] args) {
		//StirngTokenizer() 이용하여 입력한 문장의 단어와 총 단어 수 출력
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("문장을 입력하세요. 종료는 exit>>");
			String line=sc.nextLine();
			
			if(line.equalsIgnoreCase("exit"))break;
			//StringTokenizer stk 생성
			StringTokenizer stk=new StringTokenizer(line);
			System.out.println("단어수:"+stk.countTokens());
			while(stk.hasMoreTokens()) {
				System.out.println("단어:"+stk.nextToken());
			}
		}
			sc.close();
			
			
		}
		
		
	}


