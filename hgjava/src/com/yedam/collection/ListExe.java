package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("김민석");
		names.add(1, "이만수");
		names.add(1, "이만우");
		names.add(1, "김만우");
		names.remove(1);
		names.clear();
		
		//반복문
		for(String name : names)
		{
			System.out.println(name);
		}
		System.out.println(names.size());
		if (names.size() > 2) {
			System.out.println(names.get(1));			
		}
		
		List<Member> members = new ArrayList<Member>();
		members.add(new Member(1, "홍길동"));
		members.add(new Member(2, "김길동"));
		members.add(new Member(3, "이충희"));
		
		for (Member member : members) {
			System.out.println(member.getName());
			System.out.println(member.getMid());
		}
	}
}
