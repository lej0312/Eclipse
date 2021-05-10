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
	HashMap<String,Person>map=new HashMap<>(); //Person value���� ��ü�� ����
	map.put("ȫ�浿",new Person("1","010-1111-1111"));
	map.put("�̼���",new Person("2","010-2222-2222"));
	map.put("������",new Person("3","010-3333-3333"));
	System.out.println(map);
	//ȫ�浿�� ���� ���
	System.out.println(map.get("ȫ�浿"));
	//�̼����� ���� ��� =>p�� ���
	//p ����
	Person p=map.get("�̼���");
	System.out.println(p);

}
}