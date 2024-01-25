package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObj("Hong");
		String result = box.getObj();
	
		Box<Integer> box2 = new Box<Integer>();
		box2.setObj(100);
		Integer result2 = box2.getObj();
		
		List<Integer> list =new ArrayList<Integer>();
	}
}
