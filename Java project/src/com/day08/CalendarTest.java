package com.day08;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������� �Է�(yyyyMMdd)>>");
		String birth=sc.next();
		
		Calendar today=Calendar.getInstance();
		int year=Integer.parseInt(birth.substring(0,4));
		System.out.println("����:"+(today.get(Calendar.YEAR)-year)); 
		//System.out.println("����:"+sex);
	
		
		int month=Integer.parseInt(birth.substring(4,6));
		int day=Integer.parseInt(birth.substring(6,8));
		Calendar birthday=Calendar.getInstance();
		birthday.set(year,month-1,day);
		String[]arr= {"��","��","ȭ","��","��","��","��"};
		System.out.println("�¾ ����:"+arr[birthday.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
