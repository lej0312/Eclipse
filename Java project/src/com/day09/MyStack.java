package com.day09;

import java.util.ArrayList;

//419
public class MyStack {
	private ArrayList<String> arrayStack=new ArrayList<>();
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.remove(len-1));
	}
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
