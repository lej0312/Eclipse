package com.day05_object;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1=new Circle("피자",10);
		c1.getArea(); //피자 넓이는 314
		
		Circle c2=new Circle();
		c2.setName("도넛");
		c2.setR(5);
		c2.getArea();
		
		Circle c3=new Circle("피자",15);
		Circle c4=new Circle("피자",20);
		Circle c5=new Circle("피자",25);
		//총넓이
		System.out.println(c1.getA()+c2.getA()+c3.getA()+c4.getA()+c5.getA());
		//int형 크기 5이 배열
		//int[] arr=new int[5];
		//문자형 크기 5인 배열
		//String[] str=new String[5];
		//Circle형 크기 5인 배열
		Circle[]cirArr=new Circle[5];
		cirArr[0]=c1;
		cirArr[1]=c2;
		cirArr[2]=c3;
		cirArr[3]=c4;
		cirArr[4]=c5;
		double sum=0;
		for(int i=0;i<cirArr.length;i++) {
			sum += cirArr[i].getA();
		}
		System.out.println("합:"+sum);
	}

}
