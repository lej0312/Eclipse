package com.day09;

import java.util.HashMap;

class Person{
	private String id;
	private String tel;
	
	public Person(String id,String tel) {
		this.id=id;
		this.tel=tel;
	}
	//getter
	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", tel=" + tel + "]";
	}
}

public class HashStudent {
	public static void main(String[] args) {
	HashMap<String,Person>map=new HashMap<>(); //Person value값에 객체를 대입
	map.put("홍길동",new Person("1","010-1111-1111"));
	map.put("이순신",new Person("2","010-2222-2222"));
	map.put("강감찬",new Person("3","010-3333-3333"));
	System.out.println(map);
	//홍길동의 정보 출력
	System.out.println(map.get("홍길동"));
	//이순신의 정보 출력 =>p에 담기
	//p 정의
	Person p=map.get("이순신");
	System.out.println(p);

}
}