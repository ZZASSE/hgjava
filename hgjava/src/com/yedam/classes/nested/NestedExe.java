package com.yedam.classes.nested;

public class NestedExe {
	public static void main(String[] args) {
		//Outer클래스의 기능을 활용.
		Outer outer = new Outer();
		outer.method1();
		
		Outer.NestedClass nest = outer.new NestedClass();
		nest.field2 = "반갑습니다.";
		System.out.println(nest.field2);
		
		nest.method2();
	}
}
