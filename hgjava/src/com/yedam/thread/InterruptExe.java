package com.yedam.thread;

class PrintThread2 extends Thread {
	@Override
	public void run() {
		// stop => true로 변경이 될 때 프로그램 종료 코드 생성
		while(true) {
			System.out.println("실행중");
			
			try {
				Thread.sleep(1);				
			} catch (InterruptedException e) {
				break; //쓰레드를 종료하기 위한 코드 작성
			}
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}

public class InterruptExe {
	public static void main(String[] args) {
		PrintThread2 thread2 = new PrintThread2();
		thread2.start();
		
		try { Thread.sleep(1000);}catch(Exception e) {}
		
		thread2.interrupt(); //실행되고 있는 thread에서 interrupted 예외를 발생시켜준다.
	}
}
