package com.yedam.classes;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		//drawCalendar(2024, 1);
		
		Date date = new Date(); //시작시점이 1900년, 쓰기 불편해서 곧 사라짐
		
		//2024-10-5
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			date = sdf.parse("2024-03-20"); //string => Date 로 바꿔줌			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		drawCalendar(date);
	}
	
	static void drawCalendar(Date _date) {
		//해당 달의 달력이 그려지는 함수
		
		System.out.println(_date.getMonth());
		System.out.println(_date.getDate());
		System.out.println(_date.getDay());
	}
	
	static void drawCalendar(int _year, int _month)
	{
		Calendar cal = Calendar.getInstance();
		
		//매개변수로 들어온 연도 및 달 설정
		cal.set(_year, _month - 1, 1);
		
		//첫날 시작 요일
		int firstDate = cal.get(Calendar.DAY_OF_WEEK);
		
		//해당 달의 일수
		int daysOfMonth = cal.getActualMaximum(Calendar.DATE);
		
		//상단 요일 표기
		for(int i = 1; i <= Calendar.DAY_OF_WEEK; ++i)
		{
			String date = "";
			switch(i)
			{
			case 1:
				date = "S";
				break;
			case 2:
				date = "M";
				break;
			case 3:
				date = "T";
				break;
			case 4:
				date = "W";
				break;
			case 5:
				date = "T";
				break;
			case 6:
				date = "F";
				break;
			case 7:
				date = "Sat";
				break;
			}
			System.out.printf("%4s", date);
		}
		System.out.println("");
		
		//공백 만들기
		for(int i = 1; i < firstDate; ++i)
		{
			System.out.printf("%4s", "");
		}
		
		//한달 표기하기
		for(int i = 1; i <= daysOfMonth; ++i)
		{
			cal.set(_year, _month - 1, i);
			
			System.out.printf("%4d", i);
			
			int today = cal.get(Calendar.DAY_OF_WEEK);
			
			if (today % 7 == 0)
			{
				System.out.print("\n");
			}
		}
	}
}
