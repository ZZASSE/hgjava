package com.yedam.condition;

public class ArrayExe {
	public static void main(String[] args) {
		int[] intAry = new int[15];
		
		for(int i = 0; i < intAry.length; ++i)
		{
			intAry[i] = (int)(Math.random() * 10) + 1;
		}
		
		int sum1 = 0;
		int sum2  = 0;

		for(int i = 0; i < intAry.length; ++i)
		{
			if (intAry[i] % 2 == 0)
			{
				System.out.println(intAry[i] + ": 2의 배수");
				sum1 += intAry[i];
			}
			
			if (intAry[i] % 3 == 0)
			{
				System.out.println(intAry[i] + ": 3의 배수");
				sum2 += intAry[i];
			}
		}
		System.out.println("짝수 합: " + sum1 + ", 홀수 합: " + sum2);
	}
}
