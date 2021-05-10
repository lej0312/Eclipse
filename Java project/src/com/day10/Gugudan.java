package com.day10;

public class Gugudan {
	private int dan;
	public Gugudan(int dan) {
		this.dan=dan;
		
	}
	public void print() {
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

	public static void main(String[] args) {
		Gugudan g1=new Gugudan(5);
		g1.print(); // 5*1
		
		Gugudan g2=new Gugudan(6);
		g2.print(); 
		
		Gugudan g3=new Gugudan(9);
		g3.print(); 
		
	}

}
