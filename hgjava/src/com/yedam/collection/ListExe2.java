package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExe2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<String> list1 = new ArrayList<String>();
		for(int i = 0; i < 100000; ++i)
		{
			list1.add(0, String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("결과1: " + (end - start));

		start = 0;
		end = 0;
		
		start = System.currentTimeMillis();
		List<String> list2 = new LinkedList<String>();
		for(int i = 0; i < 100000; ++i)
		{
			list2.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("결과2: " + (end - start));
	}
}
