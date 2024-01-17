package com.yedam.condition;

public class LoopExe4 {
	public static void main(String[] args) {
		
		int inputValue = 10;
		
		//4열
		for(int i = 0; i < inputValue; ++i)
		{
			//공백
			for(int j = 0; j < (inputValue - i); j++)
			{
				System.out.printf("-");
			}
			
			//왼쪽 별
			System.out.printf("*");
			
			//가운데 공백
			for(int k = 0; k < ((i + i) - 1); ++k)
			{
				System.out.printf("-");
			}
			
			//오른쪽 별
			if (i != 0)
			{
				System.out.printf("*");
			}
			
			System.out.println("");
		}
	}

	public static void method1() {
		// 구구단 출력
		for (int i = 3; i < 10; ++i) {
			System.out.println("=== " + i + "단 ===");
			for (int j = 1; j < 10; ++j) {
				System.out.println(i + " X " + j + " = " + (j * i));
			}
			System.out.println("");
		}
	}

	public static void method2() {
		int num = 1;
		for (int i = num; i < 10; ++i) {
			for (int j = 2; j < 10; ++j) {
				System.out.printf("%-1d X %-1d = %2d	", j, i, (i * j));
			}
			System.out.println();
			num++;
		}
	}
}
