package com.day09;

import java.util.HashSet;
import java.util.Iterator;

//423
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add(new String("ȫ�浿1"));
		hashSet.add(new String("ȫ�浿2"));
		hashSet.add(new String("ȫ�浿3"));
		hashSet.add(new String("ȫ�浿4"));
		hashSet.add(new String("ȫ�浿4"));
		
		System.out.println(hashSet);
		Iterator<String> it=hashSet.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
