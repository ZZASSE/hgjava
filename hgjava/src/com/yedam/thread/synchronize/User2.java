package com.yedam.thread.synchronize;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator _calculator)
	{
		setName("User2 Thread");
		this.calculator = _calculator;
	}
	
	@Override
	public void run() {
		calculator.SetMemory(50);
	}
}
