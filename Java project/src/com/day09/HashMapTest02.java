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
		System.out.println("id/password�� �Է��ϼ���");
		//�Է��Ͻ� id�� �����ϴ�.
		//��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		//��� ��ġ�մϴ�.
		System.out.println("ID�Է�>>");
		String id=sc.next();
		System.out.println("password�Է�>>");
		String password=sc.next();
		//id �ʿ� �ִ°�?
		if(!hm.containsKey(id)) { //hm.containsKey(id)==false
			System.out.println("�Է��Ͻ� ID�� �����ϴ�.");
			return; //void�� ���¿��� return�� �Է��ϸ� ������ �ǹ�
		}
		if(hm.get(id).equals(password)) {
			System.out.println("��� ��ġ�մϴ�.");
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			
		}
	}	

}
