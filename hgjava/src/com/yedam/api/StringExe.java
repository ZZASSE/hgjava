package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str = "Hello"; //문자열 생성방식1
		str = new String("Hello"); //문자열 생성방식2
		byte[] bytes = str.getBytes();
		for(byte b : bytes) {
			System.out.println(b);
		}
		str = new String(new byte[] {72, 101, 108, 108, 111}); //문자열 생성방식3
		
		int pos = str.indexOf("l");
		System.out.println(pos);
		
		char chr = str.charAt(0);
		System.out.println(chr);
	}
}
