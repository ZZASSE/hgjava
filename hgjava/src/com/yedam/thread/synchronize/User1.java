package com.yedam.thread.synchronize;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator _calculator)
	{
		setName("User1 Thread");
		this.calculator = _calculator;
	}
	
	@Override
	public void run() {
		calculator.SetMemory(100);
	}
}
