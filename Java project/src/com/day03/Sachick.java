package com.day03;

public class Sachick {
	
	
	public void add(int a,int b) {//µ¡¼À
		System.out.println(a+"+"+b+"="+(a+b));
	}
	public void sub(int a,int b) {//»¬¼À
		System.out.println(a+"-"+b+"="+(a-b));
	}
	public void mul(int a,int b,int c) {//°ö¼À
		System.out.println(a*b*c);
	}
	public int div(int a,int b) {//³ª´°¼À
		//System.out.println(a/b);
		return a/b;//***return°ªÀÌ ¾øÀ»¶§ void¸¦ »ç¿ëÇÏ±â ¶§¹®¿¡ ¿©±â¼± int°¡ »ç¿ëµÊ
	}
	
	public static void main(String[] args) {
		Sachick s1=new Sachick();
		s1.add(5,3);
		s1.sub(20,10);
		s1.mul(2,3,4);
		//s1.div(20,10);
		System.out.println("³ª´°¼À °á°ú:"+s1.div(20,10));
		int result=s1.div(100,20);
		System.out.println(result);
		
		
	}

}
