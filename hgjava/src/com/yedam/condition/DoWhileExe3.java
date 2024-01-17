package com.yedam.condition;

public class DoWhileExe3 {
	public static void main(String[] args) {
		boolean run = false;
		int num = 0;
		do {
			System.out.println("한번 출력합니다..");
			run = true;
			num++;
			 
			if( num > 3)
				run = false;
		}
		while(run);
		{
			System.out.println("반복");
		}
		System.out.println("end of prog.");
	}
}
