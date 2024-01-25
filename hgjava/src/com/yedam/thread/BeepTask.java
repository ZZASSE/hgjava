package com.yedam.thread;

import java.awt.Toolkit;

//Runnable 인터페이스의 구현객체를 통해서
public class BeepTask implements Runnable {

	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; ++i) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
