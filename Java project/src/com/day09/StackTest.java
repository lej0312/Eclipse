package com.day09;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String>st=new Stack<>();
		st.push("one");
		st.push("two");
		st.push("three");
		
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
