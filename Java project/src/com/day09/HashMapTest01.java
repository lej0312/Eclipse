package com.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapTest01 {
	/*
	 * 1.해쉬맵 hm 생성
	 * 2.1에서 20사이의 난수 발생 (Math.ramdom()) 3.난수 10개를 hm에 추가 단,value값 중복허용
	 * 안됨 [결과] 1 25 2 20 3 10
	 */

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 1; i < 11; i++) {
			while (true) {
				int value = (int) (Math.random() * 20) + 1; // 난수발생
				if (hm.containsValue(value) == false) { // if(!hm.containsValue(value))
					hm.put(i, value); // 래퍼클래스 hm.put(i,new Integer(value)); //1.8?이하의 낮은 버전에서는 이렇게 써야함
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
		//value값을 오름차순으로 정렬하여 출력
		List<Integer> list=new ArrayList<>(hm.values()); //맨 앞에 ArrayList도 가능 ArrayList가 List를 통해 만들어져서
		Collections.sort(list);
		System.out.println("===정렬 후===");
		for(int i:list) {
			System.out.println(i+"\t");
		}
		System.out.println("\n=======reverse=======");
		Collections.reverse(list);
		for(int i:list) {
			System.out.println(i+"\t");
		}
		System.out.println();
		System.out.println("최대값:"+Collections.max(list));
		System.out.println("최대값:"+Collections.min(list));
		
	
	
	}

}
