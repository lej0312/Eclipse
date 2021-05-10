package com.day01;

public class Exam08 {

	public static void main(String[] args) {
		int n1=5;
		System.out.println("n1:"+n1); //5
		int n2=++n1; //++n 전위연산자
		System.out.println("n2:"+n2); //6
		int n3=n1++; //n++ 후위연산자
		System.out.println("n3:"+n3); //7
		System.out.println("n1:"+n1); //7
		System.out.println("=========");
		
		int num1=7;
		int num2=--num1; //num1=6 num2=6
		int num3=num1--; //num1=5 num3=6
		System.out.println("num1:"+num1); //5
		System.out.println("num2:"+num2); //6
		System.out.println("num3:"+num3); //6
		System.out.println("=========");
		
		
		int a=50,b=3;
		int c;
		a++; //a=51
		++b; //b=4
		c=a++ + ++b; //a=51 b=5 c=56 ==>a=52
		System.out.println("a:"+a); //52
		System.out.println("b:"+b); //5
		System.out.println("c:"+c); //56
		
		System.out.println("=========");
		
		int aa=10,bb=3;
		int cc;
		--aa; //aa=9 (전위연산자)
		bb++; //bb=3-->4 (후위연산자)
		cc=aa-- + ++bb; //aa=9 bb=5 cc=14 aa=8
		System.out.println("aa:"+aa); //8
		System.out.println("bb:"+bb); //5
		System.out.println("cc:"+cc); //14
		
		
	}

}
