package com.yedam.classes.friend;

import java.util.Scanner;

public class UserExe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserApp uApp = new UserApp();
		while(true)
		{
			System.out.println("id>>>");
			String id = scanner.nextLine();
			System.out.println("pw>>>");
			String pw = scanner.nextLine();
			
			if (uApp.login(id, pw)) {
				System.out.println("로그인 성공...");
				break;
			}
			System.out.println("id와 pw를 확인하세요.");
		}
	} 
}
