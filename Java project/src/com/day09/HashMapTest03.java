package com.day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {
	/*
	 * 1.�ؽ��� map ����
	 * 2.�ܾ �Է¹޾� �ܾ�� Ƚ�� ����
	 * 3.��ҹ��� ���о��� xġ�� ����
	 * 4.map ���
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
			System.out.println("�ܾ� �Է�>>");
			String word=sc.next();
			if(word.equalsIgnoreCase("x"))break;
//			int value;
//			if(map.containsKey(word)) { //������
//				value=map.get(word)+1;
//			}else { //������
//				value=1;
//			}
//			map.put(word, value);
		
			//���׿�����
			map.put(word,map.containsKey(word)==true?map.get(word)+1:1);
		}
		System.out.println(map);
		sc.close();
	}

}
