package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		//인덱스가 따로 없다. 반복된 요소를 넣을 수 없다.
		Set<String> names = new HashSet<String>();
		names.add("홍길동");
		names.add("김길동");
		names.add("손흥민");
		
		names.remove("손흥민");
		
		System.out.println(names.size());
		
		Iterator<String> iter = names.iterator(); //반복자
		while(iter.hasNext()) { //대상이 있는지 체크
			String result = iter.next(); //선택해서 가져옴
			System.out.println(result);
		}
		
		//확장for
		for(String name : names) {
			System.out.println(name);
		}
		
		int[] numbers = { 10, 20, 30, 20 };
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; ++i) {
			set.add(numbers[i]);
		}
		
		for(int num : set) {
			System.out.println(num);
		}
	}
}
