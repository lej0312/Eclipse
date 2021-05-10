package com.day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("java", "1111");
		hm.put("oracle", "1234");
		hm.put("jsp", "abcd");
		Scanner sc=new Scanner(System.in);
		System.out.println("id/password를 입력하세요");
		//입력하신 id는 없습니다.
		//비밀번호가 일치하지 않습니다.
		//모두 일치합니다.
		System.out.println("ID입력>>");
		String id=sc.next();
		System.out.println("password입력>>");
		String password=sc.next();
		//id 맵에 있는가?
		if(!hm.containsKey(id)) { //hm.containsKey(id)==false
			System.out.println("입력하신 ID는 없습니다.");
			return; //void인 상태에서 return을 입력하면 종료의 의미
		}
		if(hm.get(id).equals(password)) {
			System.out.println("모두 일치합니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			
		}
	}	

}
