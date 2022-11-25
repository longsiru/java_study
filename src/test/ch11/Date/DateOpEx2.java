package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
		DateTimeFormatter dft =  DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);  //현재 날짜 시간
		System.out.println("시작일: " + startDateTime.format(dft));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);  //현재 날짜 시간
		System.out.println("종료일: " + endDateTime.format(dft));
		
		if (startDateTime.isBefore(endDateTime)) {// 이전 날짜 인지?
			System.out.println("진행 중입니다");
		}else if(startDateTime.isEqual(endDateTime)) {// 같은 날짜 인지?
			System.out.println("종료 입니다");
		}else if (startDateTime.isAfter(endDateTime)) {// 이후 날짜인지?
			System.out.println("종료했습니다");
		}
	}

}
