package com.yedam.impl;

public class Helicopter extends Airplane{
	@Override
	public void takeOff() {
		System.out.println("[Helicopter] - 이륙");
	}
	@Override
	public void fly() {
		System.out.println("[Helicopter] - 비행");		
	}
	@Override
	public void land() {
		System.out.println("[Helicopter] - 착륙");				
	}
}
