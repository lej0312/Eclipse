package com.day09;


import java.util.HashMap;



public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>(); //HashMap <key값,value값>
		hm.put("one", "첫번째");
		hm.put("two", "두번째");
		hm.put("three", "세번째");
		hm.put("four", "네번째");
		System.out.println(hm);
		hm.put("four", "네번째다"); //key값 중복으로 덮어쓰기 됨
		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("oneone", "첫번째");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("three")); //get(key값)=>value값 도출
		
		//h 생성
		HashMap<String,String> h=new HashMap<>();
		h.put("1","딸기");
		h.put("2","사과");
		h.put("3","포도");
		h.put("4","바나나");
		//h 출력
		System.out.println(h);
		//value값 즉, 과일만 출력
		System.out.println(h.get("1"));
		System.out.println(h.get("2"));
		System.out.println(h.get("3"));
		System.out.println(h.get("4"));
		for(int i=1;i<=h.size();i++){
			System.out.println(h.get(i+""));
		}
		System.out.println("=========");
		for(int i=1;i<=h.size();i++) {
			System.out.println(h.get(String.valueOf(i)));
		}
		System.out.println("=========");
		for(String value:h.values()) { //***values()는 map에서 value전체 리턴
			System.out.println(value);
		}
		
		//h라는 해쉬맵에서 키값 "1"이 있나요?
		System.out.println(h.containsKey("1")); //true false 형태로 도출
		//h라는 해쉬맵에서 value값 "바나나"가 있나요?
		System.out.println(h.containsValue("바나나"));
		
		//키 값만 출력
		for(String key:h.keySet()) { //임포트해야함
			System.out.println(key+":"+h.get(key));	
		}
		
		
	}

}
