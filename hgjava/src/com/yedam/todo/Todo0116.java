package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("입력값은?");
			String input = scn.nextLine();
			
			if (input.equals("quit"))
			{
				System.out.println("프로그램이 종료됩니다.");				
				break;
			}
			else
			{
				System.out.println("입력값은 " + input + "입니다.");				
			}
		}
	}
}
