package com.yedam.condition;

import java.util.Scanner;

public class ForLoopExe2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 어떤 조건일동안 반복
		int randValue = (int) (Math.random() * 100) + 1; // 1 ~ 10 정수
		while (true) {
			int inputValue = scanner.nextInt();
			
			if (inputValue < randValue)
			{
				System.out.println("틀린값입니다.");
				System.out.println("랜덤값이 입력값보다 더 큽니다.");				
			}
			else if (inputValue > randValue)
			{
				System.out.println("틀린값입니다.");
				System.out.println("랜덤값이 입력값보다 더 작습니다.");				
			}
			else
			{
				System.out.printf("정답입니다. 랜덤값 %d ", randValue);
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
