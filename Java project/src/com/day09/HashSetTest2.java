package com.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//423
public class HashSetTest2 {
	/*
	 * Set을 이용 
	 * 로또번호 6자리 출력 
	 * (1에서 45까지의 난수 6개 출력)
	 */

	public static void main(String[] args) {
		Set<Integer>set = new HashSet<>();
		while(set.size()<6) {
			int r=(int)(Math.random()*45)+1;
			set.add(r);
		}
		System.out.println(set);
		//오름차순으로 정렬해서 출력
		
		//set-->List로 변환
		List<Integer>list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
