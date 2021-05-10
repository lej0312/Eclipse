package com.day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {
	/*
	 * 1.해쉬맵 map 생성
	 * 2.단어를 입력받아 단어와 횟수 저장
	 * 3.대소문자 구분없이 x치면 종료
	 * 4.map 출력
	 * eg)java java test test java test oracle database
	 * java 3
	 * test 3
	 * oracle 1
	 * database 1
	 */
	
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("단어 입력>>");
			String word=sc.next();
			if(word.equalsIgnoreCase("x"))break;
//			int value;
//			if(map.containsKey(word)) { //있으면
//				value=map.get(word)+1;
//			}else { //없으면
//				value=1;
//			}
//			map.put(word, value);
		
			//삼항연산자
			map.put(word,map.containsKey(word)==true?map.get(word)+1:1);
		}
		System.out.println(map);
		sc.close();
	}

}
