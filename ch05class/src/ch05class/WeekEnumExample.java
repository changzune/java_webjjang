package ch05class;

import java.util.Calendar;

public class WeekEnumExample {
	
	public static void main(String[] args) {
		//오늘 날짜를 객체로 받고 요일을 가져온다.1~7
		Calendar cal = Calendar.getInstance();//intstance 객체를 가져온다.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		Week today = null;
		
		//week(int type)에 따라 today(7개 Week Type)
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;

		default:
			System.out.println("잘못된 정보 입니다.");
			break;
		}
		
		System.out.println("오늘 요일 : " + today);
		System.out.println(today.ordinal());
		System.out.println(Week.valueOf(today.toString()));
		
		String [] todayKors = {"일","월","화","수","목","금","토"};
		System.out.println("오늘 요일 :  " + todayKors[week-1]);
		System.out.println("오늘 요일 :  " + todayKors[today.ordinal()]);
	}

}