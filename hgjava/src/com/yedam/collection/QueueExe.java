package com.yedam.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExe {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		//offer, pull
		queue.offer("1번");
		queue.offer("2번");
		queue.offer("3번");
		queue.offer("4번");
		queue.offer("5번");
		
		while(!queue.isEmpty()) {
			String result = queue.poll();
			System.out.println(result);
		}
	}
}
