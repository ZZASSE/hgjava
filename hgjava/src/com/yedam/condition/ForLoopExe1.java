package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
		
		int oneWeek = 7;
		
		System.out.printf("%3s", " ");
		for(int i = 1; i <= 31; ++i)
		{
			System.out.printf("%3d", i);
			
			if (i % oneWeek == 6)
			{
				System.out.println("");
			}
		}
	}
}
