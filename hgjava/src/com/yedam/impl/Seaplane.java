package com.yedam.impl;

public class Seaplane extends Airplane{
	@Override
	public void takeOff() {
		System.out.println("[Seaplane] - 이륙");
	}
	@Override
	public void fly() {
		System.out.println("[Seaplane] - 비행");		
	}
	@Override
	public void land() {
		System.out.println("[Seaplane] - 착륙");				
	}
}
