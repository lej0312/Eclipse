package com.day08;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg,Calendar cal) {
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1; //0부터 시작해서 +1
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(msg+":"+year+"/"+month+"/"+day);
		int dayOfweek=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일:"+dayOfweek);
		switch(dayOfweek) {
		case 1:System.out.println("일요일");break;
		case 2:System.out.println("월요일");break;
		case 3:System.out.println("화요일");break;
		case 4:System.out.println("수요일");break;
		case 5:System.out.println("목요일");break;
		case 6:System.out.println("금요일");break;
		case 7:System.out.println("토요일");break;
		}
		
		switch(dayOfweek) {
		case Calendar.SUNDAY:System.out.println("일요일");break;
		case Calendar.MONDAY:System.out.println("월요일");break;
		case Calendar.TUESDAY:System.out.println("화요일");break;
		case Calendar.WEDNESDAY:System.out.println("수요일");break;
		case Calendar.THURSDAY:System.out.println("목요일");break;
		case Calendar.FRIDAY:System.out.println("금요일");break;
		case Calendar.SATURDAY:System.out.println("토요일");break;
		}
		
		//배열
		String[]days= {"일","월","화","수","목","금","토"};
		System.out.println("배열요일:"+days[dayOfweek-1]);
		System.out.println("=========");
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		int millis=cal.get(Calendar.MILLISECOND); //1초=1000밀리세컨드
		int ampm=cal.get(Calendar.AM_PM);
		
		
		System.out.println(hour+":"+min+":"+sec+":"+millis);
		System.out.println("ampm:"+ampm);
		if(ampm==Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
	}
	
	

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		CalendarEx.printCalendar("현재",now);
		
		Calendar someday=Calendar.getInstance();
		someday.set(2020,11,25); 
		CalendarEx.printCalendar("어느 날",someday);
	}

}
