package com.yedam.classes.nested;

public class Outer {
	String field1;
	
	//인스턴스 멤버 클래스
	class NestedClass{
		String field2;
		
		//중첩클래스
		void method2() {
			System.out.println("method2()");
		}
	}
	
	//정적 멤버 클래스
	static class StaticClass{
		static String field3;
		static void method3() {
			System.out.println("method3()");
		}
	}
	
	void method1() {
		//중첩클래스 인스턴스 생성
		NestedClass nest = new NestedClass();
		nest.field2 = "안녕!";
		System.out.println(nest.field2);
		nest.method2();
		
		StaticClass.method3();
	}
}
