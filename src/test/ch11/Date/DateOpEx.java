package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();  //현재 날짜 시간
		DateTimeFormatter dft =  DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		System.out.println("현재시간: " + now.format(dft));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println(result1.format(dft));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println(result2.format(dft));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println(result3.format(dft));
	}

}
