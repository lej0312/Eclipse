package com.day09;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer>vc=new Vector<>();
		vc.add(5);
		vc.add(new Integer(5));
		vc.add(-1);
		vc.add(2,100);
		for(Integer i:vc) {
			System.out.println(i+"\t");
		}
		System.out.println();
		Iterator<Integer>it=vc.iterator(); //***Iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
