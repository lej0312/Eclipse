package com.day05_object;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//�迭
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		
		ArrayList alist=new ArrayList(); //Array list:��ü�� ����ϴ� �ڷ� ����
		//*add size get���� ���
		alist.add("one");
		alist.add(1);
		alist.add("two");
		alist.add(new Integer(2));
		System.out.println("�迭 ����:"+arr.length);
		System.out.println("alist ����:"+alist.size());
		alist.add(1,"apple");
		alist.add("three");
		alist.add("����");
		alist.add("�ٳ���");
		alist.remove("����");
		alist.remove(0);
		//alist.clear();
		
		for(int i=0; i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println(alist.get(2));
		System.out.println("alist ������ ����:"+alist.get(alist.size()-1));
		//for-each
		for(Object obj:alist) {//Object:�ڹ��� �ֻ��� ��ü (���� int.String�� ȥ��� Object ���)
			System.out.println(obj);
		}
		//���׸�
		ArrayList<String> blist=new ArrayList<>();
		blist.add("����");
		//blist.add(1)
		for(String ob:blist){
			System.out.println(ob);
		}
	
		ArrayList<Integer> clist=new ArrayList<>();
		clist.add(1);
		clist.add(2);
		//clist.add("aa");
		for(int i:clist) {
			System.out.println(i);
		}
	}
}
