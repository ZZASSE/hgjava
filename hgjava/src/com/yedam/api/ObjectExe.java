package com.yedam.api;

public class ObjectExe {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.equals(obj2)); //Object.equals() 주소값을 비교하기 때문에 항상 false
		
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1.equals(str2));
		
		Member mbr1 = new Member();
		Member mbr2 = new Member();
		mbr1.name = "김회원";
		mbr1.age = 20;
		mbr2.name = "박회원";
		mbr2.age = 21;
		System.out.println(mbr1.equals(mbr2)); //내가 생성한 클래스는 기본적으로 Object의 상속을 받고 있기 때문에 자동으로
												//Object가 가진 메서드들을 쓸 수 있다.
	}
}
