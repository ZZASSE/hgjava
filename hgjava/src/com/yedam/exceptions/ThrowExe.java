package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외입니다.");
		}
	}

	static void method() throws ClassNotFoundException {

		Class.forName("java.lang.String");
	}
}
