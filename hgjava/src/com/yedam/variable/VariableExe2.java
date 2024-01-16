package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		//이름 입력 (=name), 연락처(=phone) : scn.nextLine()
		System.out.println("이름은?");
		String name = scn.nextLine();
		
		System.out.println("연락처는?");
		String tel = scn.nextLine();
		
		//영어(=eng), 수학(=mat) => 합계(=sum) : scn.nextInt()
		System.out.println("영어 점수는?");
		int engScore = scn.nextInt();
		System.out.println("수학 점수는?");
		int mathScore = scn.nextInt();
		
		System.out.println("이름: " + name + ", 연락처: " + tel);
		System.out.println("영어: " + engScore + ", 수학: " + mathScore + 
				". 합계: " + (engScore + mathScore));
	}
}
