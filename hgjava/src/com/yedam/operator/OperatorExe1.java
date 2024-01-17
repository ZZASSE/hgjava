package com.yedam.operator;

import java.util.Scanner;

public class OperatorExe1 
{
	public static void main(String[] args) 
	{
		
	}

	public static void method1()
	{
		int sum = 1 + 2 * 3;
		sum = sum + 5;
		sum += 5;

		String str = "";
		Scanner scn = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("문자열을 입력하세요 >>> ");
			String input = scn.nextLine();
			if (input.equals("quit")) 
			{
				break;
			}
			str += input + " ";
		}
		
		System.out.println("누적 내용: " + str);
		System.out.println("end of prog.");
	}
	public static void method2()
	{
		int result = 0;
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
			//사용자에게 값을 입력: 
			System.out.println("값 입력 >>>");
			String input = scn.nextLine();
			
			if (input.equals("quit"))
			{
				System.out.println("누적된 값: " + result);
				break;
			}
			
			try 
			{
				result += Integer.parseInt(input);				
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}
