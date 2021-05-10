package com.day05_object;

import java.util.Scanner;

//배열이용
public class PhoneMain {
	Scanner sc=new Scanner(System.in);
	Phone[]arr;//선언
	public void inputPhone() {//입력 수를 물어봄
	System.out.println("입력갯수>>");
	int num=sc.nextInt();
	arr=new Phone[num]; //new==>생성
	//이름,전화번호 입력받아 배열에 저장하기
	for(int i=0;i<arr.length;i++) {
		System.out.println("이름:");
		String name=sc.next();
		System.out.println("전화:");
		String tel=sc.next();
		//arr[i]=new Phone(name,tel); //아래 세 줄과 같음
		arr[i]=new Phone();
		arr[i].setName(name);
		arr[i].setTel(tel);
	}
	
	
	}
	public void viewPhone() {
		for(Phone p:arr) {
			System.out.println("이름:"+p.getName());
			System.out.println("전화:"+p.getTel());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PhoneMain pm=new PhoneMain();
		pm.inputPhone();
		pm.viewPhone();
		
		
		
		
		

	}

}
