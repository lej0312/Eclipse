package com.day09;


import java.util.HashMap;



public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>(); //HashMap <key��,value��>
		hm.put("one", "ù��°");
		hm.put("two", "�ι�°");
		hm.put("three", "����°");
		hm.put("four", "�׹�°");
		System.out.println(hm);
		hm.put("four", "�׹�°��"); //key�� �ߺ����� ����� ��
		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("oneone", "ù��°");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("three")); //get(key��)=>value�� ����
		
		//h ����
		HashMap<String,String> h=new HashMap<>();
		h.put("1","����");
		h.put("2","���");
		h.put("3","����");
		h.put("4","�ٳ���");
		//h ���
		System.out.println(h);
		//value�� ��, ���ϸ� ���
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
		for(String value:h.values()) { //***values()�� map���� value��ü ����
			System.out.println(value);
		}
		
		//h��� �ؽ��ʿ��� Ű�� "1"�� �ֳ���?
		System.out.println(h.containsKey("1")); //true false ���·� ����
		//h��� �ؽ��ʿ��� value�� "�ٳ���"�� �ֳ���?
		System.out.println(h.containsValue("�ٳ���"));
		
		//Ű ���� ���
		for(String key:h.keySet()) { //����Ʈ�ؾ���
			System.out.println(key+":"+h.get(key));	
		}
		
		
	}

}
