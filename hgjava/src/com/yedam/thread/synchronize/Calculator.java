package com.yedam.thread.synchronize;

public class Calculator {
	// User1, User2 작업공간
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void SetMemory(int _memory) {
		System.out.println(Thread.currentThread().getName());
		memory = _memory;
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " >> " + this.memory);
	}
}
