package com.day08;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("생년월일 입력(yyyyMMdd)>>");
		String birth=sc.next();
		
		Calendar today=Calendar.getInstance();
		int year=Integer.parseInt(birth.substring(0,4));
		System.out.println("나이:"+(today.get(Calendar.YEAR)-year)); 
		//System.out.println("성별:"+sex);
	
		
		int month=Integer.parseInt(birth.substring(4,6));
		int day=Integer.parseInt(birth.substring(6,8));
		Calendar birthday=Calendar.getInstance();
		birthday.set(year,month-1,day);
		String[]arr= {"일","월","화","수","목","금","토"};
		System.out.println("태어난 요일:"+arr[birthday.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
