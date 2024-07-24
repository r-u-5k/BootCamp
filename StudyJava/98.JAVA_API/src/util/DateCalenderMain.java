package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalenderMain {

	public static void main(String[] args) throws Exception {
		long currentTime = System.currentTimeMillis();
		System.out.println("System.currentTimeMillis(): " + currentTime);
		
		long startTime = System.currentTimeMillis();
		Thread.sleep(12);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("duration: " + duration + "ms");
		
		/*
		 * java.util.date
		 */
		Date now = new Date();
		String nowString = now.toLocaleString();
		System.out.println(nowString);
		long currentTimeMillis1 = now.getTime();
		System.out.println("Date.getTime(): " + currentTimeMillis1);
		
		System.out.println("--- SimpleDateFormat [Date -> String] ---");
		/*
		 * SimpleDateFormat [Date -> String]
		 *   - Date 객체의 시간을 문자열로 변경해주는 클래스
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf1.format(now));
		
		sdf1.applyPattern("yyyy");
		System.out.println(sdf1.format(now));

		System.out.println("-----  [String -> Date] -----");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay = sdf2.parse("2000-08-24");
		System.out.println(myBirthDay.toString());
		System.out.println(myBirthDay.toLocaleString());
		System.out.println(myBirthDay.toGMTString());
		
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay = sdf2.parse("1995/05/12 12:34:56");
		System.out.println(yourBirthDay.toString());
		System.out.println(yourBirthDay.toLocaleString());
		System.out.println(yourBirthDay.getTime());
		
		System.out.println("----- Date 객체 메서드 -----");
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-03");
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-03");
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-15");
		
		System.out.println("date1.equals(date2): " + date1.equals(date2));
		System.out.println("date1.equals(date3): " + date1.equals(date3));
		System.out.println("date1.compareTo(date2): " + date1.compareTo(date2)); // 0
		System.out.println("date1.compareTo(date3): " + date1.compareTo(date3)); // -1
		
		long gapMilliSec = date3.getTime() - date2.getTime();
		System.out.println("gapMilliSec: " + gapMilliSec);
		System.out.println("sec: " + gapMilliSec / 1000);
		System.out.println("min: " + gapMilliSec / 1000 / 60);
		System.out.println("hour: " + gapMilliSec / 1000 / 60 / 60);
		System.out.println("day: " + gapMilliSec / 1000 / 60 / 60 / 24);
		
		System.out.println("- java.util.Date -> java.sql.Date -");
		java.util.Date utilDate1 = new java.util.Date();
		java.util.Date utilDate2 = new java.util.Date(System.currentTimeMillis());
		java.util.Date utilDate3 = new SimpleDateFormat("yyyy/MM/dd").parse("2021/08/09");
		
		java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
		java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
		java.sql.Date sqlDate3 = new java.sql.Date(utilDate3.getTime());
		
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		System.out.println(sqlDate3);
		
		System.out.println("- java.sql.Date -> java.util.Date -");
		java.sql.Date sqlDate4 = new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate5 = new java.sql.Date(new SimpleDateFormat("yyyy/MM/dd").parse("2020/11/25").getTime());
		
		java.util.Date utilDate4 = sqlDate4;
		java.util.Date utilDate5 = sqlDate5;
		
		System.out.println(utilDate4);
		System.out.println(utilDate5);
		
	}

}
