package com.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapTest01 {
	/*
	 * 1.�ؽ��� hm ����
	 * 2.1���� 20������ ���� �߻� (Math.ramdom()) 3.���� 10���� hm�� �߰� ��,value�� �ߺ����
	 * �ȵ� [���] 1 25 2 20 3 10
	 */

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 1; i < 11; i++) {
			while (true) {
				int value = (int) (Math.random() * 20) + 1; // �����߻�
				if (hm.containsValue(value) == false) { // if(!hm.containsValue(value))
					hm.put(i, value); // ����Ŭ���� hm.put(i,new Integer(value)); //1.8?������ ���� ���������� �̷��� �����
					break;
				} // if
			} // while
		} // for
		System.out.println(hm);
		System.out.println("========");
		for (int value : hm.values()) {
			System.out.println(value +"\t");
		}
		System.out.println();
		//value���� ������������ �����Ͽ� ���
		List<Integer> list=new ArrayList<>(hm.values()); //�� �տ� ArrayList�� ���� ArrayList�� List�� ���� ���������
		Collections.sort(list);
		System.out.println("===���� ��===");
		for(int i:list) {
			System.out.println(i+"\t");
		}
		System.out.println("\n=======reverse=======");
		Collections.reverse(list);
		for(int i:list) {
			System.out.println(i+"\t");
		}
		System.out.println();
		System.out.println("�ִ밪:"+Collections.max(list));
		System.out.println("�ִ밪:"+Collections.min(list));
		
	
	
	}

}
