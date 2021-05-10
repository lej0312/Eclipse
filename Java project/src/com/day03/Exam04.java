package com.day03;

import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
	int[] data= {10,5,100,200,30,77};
	int sum=0;
	int max=data[0];//최대값
	int maxPos=0;//최대값위치
	for(int i=0;i<data.length;i++) {
		sum += data[i];
		if(max<data[i]) {
			max=data[i];
			maxPos=i+1;
		}
	}
	System.out.println("최대값:"+max);
	System.out.println("최대값위치:"+maxPos);
	System.out.println("배열합계:"+sum);
	System.out.println("평균:"+(float)sum/data.length);
	
	//숫자를 입력받아 그 수가 배열에 있으면 있습니다.
	//없으면 없습니다 출력
	System.out.println("찾는 수 입력>>"); //55
	Scanner sc=new Scanner(System.in);
	int search=sc.nextInt();//55
	boolean flag=false; //일반적으로 boolean 초기값 false
	for(int i=0;i<data.length;i++) {
		if(search==data[i]) {
			System.out.println("있습니다.");
			flag=true;
			break;//생략가능
		}
	}
	if(flag==false) {
		System.out.println("없습니다.");
	}
	//Math.random()난수발생
	//0에서 1사이의 double형 난수발생
	System.out.println(Math.random());
	//0에서 10사이의 난수발생
	int r=(int)(Math.random()*10);
	System.out.println(r);

	
	
	
	

	}
}
