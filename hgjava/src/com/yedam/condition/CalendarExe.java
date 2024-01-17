package com.yedam.condition;

import java.io.Console;

public class CalendarExe {
	public static void main(String[] args) {
		
		
		int inputMonth = 4;
		String lastDay = "";
		
		int lessDay = 0;
		for(int month = 1; month <= 12; ++month)
		{
			//이번 달이 몇일 까지 있는지 계산
			int currentMonthDays = month % 2 == 0 ? 31 : 30;
			
			//일 지날 때 마다 요일 계산
			for(int day = 1 + lessDay; day <= currentMonthDays + lessDay; ++day)
			{
				if (day + lessDay == currentMonthDays + lessDay)
				{
					lessDay = day % 7;
				}
				//찾고자 하는 달의 마지막 날일 때
				if (month == inputMonth && day + lessDay == currentMonthDays + lessDay)
				{
					switch(day % 7)
					{
					case 1:
						lastDay = "월요일";
						break;
					case 2:
						lastDay = "화요일";
						break;
					case 3:
						lastDay = "수요일";
						break;
					case 4:
						lastDay = "목요일";
						break;
					case 5:
						lastDay = "금요일";
						break;
					case 6:
						lastDay = "토요일";
						break;
					case 0:
						lastDay = "일요일";
						break;
					}
					
					System.out.println(lastDay);
				}
			}
		}
	}
	
	
}
