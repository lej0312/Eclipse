package com.day05_object;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//배열
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		
		ArrayList alist=new ArrayList(); //Array list:객체를 취급하는 자료 구조
		//*add size get등을 사용
		alist.add("one");
		alist.add(1);
		alist.add("two");
		alist.add(new Integer(2));
		System.out.println("배열 길이:"+arr.length);
		System.out.println("alist 길이:"+alist.size());
		alist.add(1,"apple");
		alist.add("three");
		alist.add("딸기");
		alist.add("바나나");
		alist.remove("딸기");
		alist.remove(0);
		//alist.clear();
		
		for(int i=0; i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println(alist.get(2));
		System.out.println("alist 마지막 원소:"+alist.get(alist.size()-1));
		//for-each
		for(Object obj:alist) {//Object:자바의 최상위 객체 (위에 int.String형 혼재로 Object 사용)
			System.out.println(obj);
		}
		//제네릭
		ArrayList<String> blist=new ArrayList<>();
		blist.add("과일");
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
