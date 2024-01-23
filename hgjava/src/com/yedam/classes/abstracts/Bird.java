package com.yedam.classes.abstracts;

public class Bird extends Animal{

	public Bird(String _name)
	{
		super(_name);
	}
	@Override
	public void sleep() {
		System.out.println("[Bird]가 잠을 잡니다.");
	}
}
