package com.day08;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg,Calendar cal) {
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1; //0���� �����ؼ� +1
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(msg+":"+year+"/"+month+"/"+day);
		int dayOfweek=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("����:"+dayOfweek);
		switch(dayOfweek) {
		case 1:System.out.println("�Ͽ���");break;
		case 2:System.out.println("������");break;
		case 3:System.out.println("ȭ����");break;
		case 4:System.out.println("������");break;
		case 5:System.out.println("�����");break;
		case 6:System.out.println("�ݿ���");break;
		case 7:System.out.println("�����");break;
		}
		
		switch(dayOfweek) {
		case Calendar.SUNDAY:System.out.println("�Ͽ���");break;
		case Calendar.MONDAY:System.out.println("������");break;
		case Calendar.TUESDAY:System.out.println("ȭ����");break;
		case Calendar.WEDNESDAY:System.out.println("������");break;
		case Calendar.THURSDAY:System.out.println("�����");break;
		case Calendar.FRIDAY:System.out.println("�ݿ���");break;
		case Calendar.SATURDAY:System.out.println("�����");break;
		}
		
		//�迭
		String[]days= {"��","��","ȭ","��","��","��","��"};
		System.out.println("�迭����:"+days[dayOfweek-1]);
		System.out.println("=========");
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		int millis=cal.get(Calendar.MILLISECOND); //1��=1000�и�������
		int ampm=cal.get(Calendar.AM_PM);
		
		
		System.out.println(hour+":"+min+":"+sec+":"+millis);
		System.out.println("ampm:"+ampm);
		if(ampm==Calendar.AM) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}
	
	

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		CalendarEx.printCalendar("����",now);
		
		Calendar someday=Calendar.getInstance();
		someday.set(2020,11,25); 
		CalendarEx.printCalendar("��� ��",someday);
	}

}
