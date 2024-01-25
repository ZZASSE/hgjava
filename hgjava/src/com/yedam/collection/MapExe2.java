package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe2 {
	public static void main(String[] args) {
		Map<Member, Integer> map = new HashMap<Member, Integer>();
		map.put(new Member(1, "홍길동"), 900);
		map.put(new Member(2, "박길동"), 1200);
		map.put(new Member(3, "최길동"), 500);
		map.put(new Member(1, "홍길동"), 800);
		
		System.out.println("크기: " + map.size());
		System.out.println("키: " + new Member(1, "홍길동"));
		System.out.println("값: " + map.get(new Member(1, "홍길동")));
		
		System.out.println("키의 존재유무: " + map.containsKey(new Member(2, "박길동")));
		System.out.println("값의 존재유무: " + map.containsValue(1200));
		
		//포인트가 1000점 이상인 사람의 이름을 출력.
		Scanner scn = new Scanner(System.in);
		
		int input = Integer.parseInt(scn.nextLine());
		List<Member> members = new ArrayList<Member>();
		
		Set<Entry<Member, Integer>> entry = map.entrySet();
		Iterator<Entry<Member, Integer>> eiter = entry.iterator();
		while(eiter.hasNext()) {
			Entry<Member, Integer> ent = eiter.next();
			
			if (ent.getValue() > input)
			{
				members.add(ent.getKey());
			}
		}
		for(Member member : members)
		{
			System.out.println(member.getName());
		}
		
		for(Map.Entry<Member, Integer> ele : map.entrySet()) {
			ele.getKey();
			ele.getValue();
		}
	}
}
