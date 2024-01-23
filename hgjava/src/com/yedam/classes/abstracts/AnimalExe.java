package com.yedam.classes.abstracts;

public class AnimalExe{
	public static void main(String[] args) {
		Bird bird = new Bird("참새");
		bird.eat();
		bird.sleep();
		
		Animal animal = new Bird("제비");
		animal.eat();
		animal.sleep();
	}
}
