package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {
	public static void main(String[] args) {
		//키 : 값
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		map.put(2, "김길동");
		map.put(3, "박길동");
		map.put(4, "홍길동");
		
		System.out.println("크기: " + map.size());
		
		//키 값만 Set
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iter = keyset.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			System.out.println(value);
		}
		
		//키, 값 = > set
		Set<Entry<Integer, String>> entry = map.entrySet();
		Iterator<Entry<Integer, String>> eiter = entry.iterator();
		while(eiter.hasNext()) {
			Entry<Integer, String> ent = eiter.next(); //키, 값 동시에 가지고 있음
			System.out.printf("키: %d, 값: %s \n", ent.getKey(), ent.getValue());
		}
	}
}
