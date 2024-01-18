package com.yedam.reference;

import java.util.Scanner;

import com.yedam.todo.FriendInfo;

public class ArrayExe2 {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		//친구들 정보 담아둘 배열 생성
		FriendInfo[] friendsInfo = {
				new FriendInfo("홍길동", 67.3f, 78),
				new FriendInfo("김민수", 72.5f, 82),
				new FriendInfo("박석민", 80.3f, 77),
				new FriendInfo("최홍만", 79.3f, 90),
				new FriendInfo("김길동", 90.4f, 85),
				new FriendInfo("김말숙", 90.4f, 88),
		};
		Method1(friendsInfo);
		Method2(friendsInfo);
		Method3(friendsInfo);
		Method4(friendsInfo);
	}
	
	public static void Method1(FriendInfo[] _array)
	{
		int highScoreStudents = 0;
		int mostHighScoreStudents = 0;
		
		for(int i = 0; i < _array.length; ++i)
		{
			if (_array[i].score >= 90)
			{
				mostHighScoreStudents++;
			}
			else if (_array[i].score >= 80)
			{
				highScoreStudents++;
			}
		}
		
		System.out.println("80점 이상 학생의 수는 " + highScoreStudents + "명 입니다.");
		
		if (mostHighScoreStudents > 0)
		{
			System.out.println("90점 이상 학생의 수는 " + mostHighScoreStudents + "명 입니다.");
		}
		else 
		{
			System.out.println("90점 이상 학생의 수는 없습니다.");
		}
	}
	public static void Method2(FriendInfo[] _array)
	{
		float avg = 0;
		float sum = 0;
		
		for(int i = 0; i < _array.length; ++i)
		{
			sum += _array[i].weight;
		}
		
		sum = (Math.round(sum * 100) / 100.0f);
		avg = sum / _array.length;
		avg = (Math.round(avg * 100) / 100.0f);
		System.out.println("합계 몸무게는: "+ sum + ", 평균 몸무게는: " + avg + "입니다.");
		
		float mostHighWeight = 0;
		
		for(int i = 0; i < _array.length; ++i)
		{
			if (_array[i].weight > mostHighWeight)
			{
				mostHighWeight = _array[i].weight;
			}
		}
		System.out.println("가장 높은 몸무게는 " + mostHighWeight + "입니다.");
	}
	public static void Method3(FriendInfo[] _array)
	{
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
			boolean isFound = false;
			
			System.out.println("친구 입력>>>>");
			String name = scn.nextLine();
			
			if (name.equals("quit"))
			{
				System.out.println("실행 종료");
				break;
			}
			else 
			{
				for(int i = 0; i < _array.length; ++i)
				{
					if (_array[i].name.equals(name))
					{
						isFound = true;
						System.out.println(name + "은 " + (i + 1) + "번째에 있습니다.");
					}
				}
				
				if (isFound == false)
				{
					System.out.println("찾으시는 친구는 없습니다.");
				}
			}
		}
	}
	public static void Method4(FriendInfo[] _array)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("친구의 이름과 변경할 점수 입력>>>");
		String name = scn.nextLine(); 
		int newScore = scn.nextInt();
		
		for(int i = 0; i < _array.length; ++i)
		{
			if (_array[i].name.equals(name))
			{
				int prevScore = _array[i].score;
				_array[i].score = newScore;
				System.out.println(_array[i].name + " 점수변경 " + prevScore + " => " + _array[i].score);
				break;
			}
		}
	}
}
