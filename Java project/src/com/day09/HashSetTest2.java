package com.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//423
public class HashSetTest2 {
	/*
	 * Set�� �̿� 
	 * �ζǹ�ȣ 6�ڸ� ��� 
	 * (1���� 45������ ���� 6�� ���)
	 */

	public static void main(String[] args) {
		Set<Integer>set = new HashSet<>();
		while(set.size()<6) {
			int r=(int)(Math.random()*45)+1;
			set.add(r);
		}
		System.out.println(set);
		//������������ �����ؼ� ���
		
		//set-->List�� ��ȯ
		List<Integer>list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
