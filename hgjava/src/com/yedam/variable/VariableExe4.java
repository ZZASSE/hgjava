package com.yedam.variable;

import java.util.Scanner; //Ctrl + Shift + O

public class VariableExe4 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = 10 > 20;
		
		isTrue = update(10);
		
		if (isTrue)
		{
			System.out.println("참값.");
		}
		else 
		{
			System.out.println("거짓값.");
		}
	}
	public static boolean update(int _arg)
	{
		return _arg % 2 == 0; // return f or t
	}
}
