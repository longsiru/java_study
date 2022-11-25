package test.ch11.Date;

import java.util.Calendar;
import java.util.TimeZone;

public class CalanderEx {

	public static void main(String[] args) {
		//timeZone객체 생성
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone); //현재 시간과 날짜를 자겨온다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);  //요일  일요일: 1 ~  토요일:7
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:strWeek = "월"; break;
		case Calendar.TUESDAY:strWeek = "화"; break;
		case Calendar.WEDNESDAY:strWeek = "수"; break;
		case Calendar.THURSDAY:strWeek = "목"; break;
		case Calendar.FRIDAY:strWeek = "금"; break;
		case Calendar.SATURDAY:strWeek = "토"; break;
		case Calendar.SUNDAY:strWeek = "일"; break;
		}
		
		System.out.println(strWeek);
		System.out.println("======================================");
		
		int amPm = now.get(Calendar.AM_PM);  //am,pm인지 나ㅏ내준다(0:am, 1:pam)
		System.out.println(amPm);
		System.out.println("======================================");
		
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		System.out.println(now.get(Calendar.HOUR) + "," + now.get(Calendar.MINUTE) + "," + now.get(Calendar.SECOND));
		//HOUR: 오전/오후 기준(0~11)
		
	}

}
