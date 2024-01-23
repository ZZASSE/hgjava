package com.yedam.classes;
//전체 프로그램에서 인스턴스를 하나만 생성
public class Singleton {
	//Singleton 타입의 필드 선언
	private static Singleton instance = new Singleton();
	
	// 생성자 private 선언
	private Singleton() {
		
	}
	
	//instance를 반환하도록 getInstance()제공
	public static Singleton getInstance() {
		return instance;
	}
}
