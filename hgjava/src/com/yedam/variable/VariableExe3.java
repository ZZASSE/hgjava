package com.yedam.variable;

import java.util.Scanner; //Ctrl + Shift + O

public class VariableExe3 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("키를 잴 인원은?");
		int[] heights = new int[scn.nextInt()];
		
		for (int i = 0; i < heights.length; ++i)
		{
			System.out.println("키를 입력>>> ");
			heights[i] = scn.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < heights.length; ++i)
		{
			sum += heights[i];
		}
		int avg = Math.round(sum / heights.length);
		
		//세 사람의 평균 키는 : ???입니다.
		System.out.println("세 사람의 평균 키는 : " + avg + "입니다.");
	}
}
