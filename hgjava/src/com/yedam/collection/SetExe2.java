package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe2 {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member(1, "홍길동"));
		members.add(new Member(1, "김길동"));
		members.add(new Member(1, "박길동"));
		members.add(new Member(1, "홍길동")); //논리적으로 이미 set안에 있는 값이지만 별개의 것으로 친다 Member 클래스의 hashCode를 비교하기 때문에
											// hashCode와 equals 함수를 각각 override해줘야한다.
		
		members.remove(new Member(2, "김길동")); //제거.
		
		System.out.println(members.size());
		
		//반복된 요소를 선택해서 가져오는 반복자
		Iterator<Member> iter = members.iterator();
		
		while(iter.hasNext()) {
			Member member = iter.next();
			System.out.println(member);
		}
	}
}
