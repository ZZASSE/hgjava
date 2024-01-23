package com.yedam.classes.abstracts;

public abstract class Animal {
	private String name;
	
	public Animal() {
		
	}
	public Animal(String _name) {
		this.name = _name;
	}
	
	public void eat() {
		System.out.println("[Animal]이 음식을 먹습니다.");
	}
	
	// 추상메서드 : 구현 부분 x, 자식클래스에서 명시적 구현을 해줘야한다. override
	public abstract void sleep();
}
