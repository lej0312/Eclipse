package com.day05_object;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList이용
public class PhoneMain2 {
	Scanner sc=new Scanner(System.in);
	//ArrayList alist 생성하기
	ArrayList<Phone> alist=new ArrayList<>();
	public void inputPhone() {//입력 수를 물어봄
	System.out.println("입력갯수>>");
	int num=sc.nextInt();
	for(int i=0;i<num;i++) {//이름,전화번호 입력받아 배열에 저장하기
		System.out.println("이름:");
		String name=sc.next();
		System.out.println("전화:");
		String tel=sc.next();
		//arr[i]=new Phone(name,tel); 
		alist.add(new Phone(name,tel));
	}
	}
	public void viewPhone() {
		for(Phone p:alist) {
			System.out.println("이름:"+p.getName());
			System.out.println("전화:"+p.getTel());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PhoneMain2 pm=new PhoneMain2();
		pm.inputPhone();
		pm.viewPhone();
		
	
	}

}
