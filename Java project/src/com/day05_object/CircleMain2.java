package com.day05_object;

public class CircleMain2 {

	public static void main(String[] args) {
		Circle[]arr=new Circle[5]; //***중요
//		Circle c1=new Circle("피자",10);
//		arr[0]=c1;
		arr[0]=new Circle("피자",10);
		arr[1]=new Circle("피자",15);
		arr[2]=new Circle("피자",20);
		arr[3]=new Circle("피자",25);
		arr[4]=new Circle("피자",30);
//		int k=0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=new Circle("피자",10+k);
//			k+=5;
//		}
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i].getA();
		}
		System.out.println("총합:"+sum);
	}

}
