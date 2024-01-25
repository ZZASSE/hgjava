package com.yedam.classes.nested;

class Parent {
	String name;

	void showName() {
		System.out.println("이름은 " + name);
	}
}

interface Runnable{
	void run(String _name); // 함수형 인터페이스. 구현해야할 메서드가 하나만 존재
}

public class AnonymousExe {
	public static void main(String[] args) {
		
		//익명 구현 객체.
		Runnable runnable = new Runnable() {
			
			@Override
			public void run(String _name) {
				System.out.println("나는 달립니다.");
			}
		};
		runnable.run("이름");
		
		runnable = (_name) -> {
			System.out.println(_name + "나는 달립니다.");
		};
		
		
		
		//익명 자식 객체.
		Parent parent = new Parent() { 
			int age;
			void showInfo(String _name, int _age) {
				name = _name;
				age = _age;
				System.out.println("이름은 " + name + ", 나이는 " + age);
			}
			@Override
			void showName() {
//				System.out.println("이름은 " + name + "입니다.");
				showInfo("홍길동", 20);
			}
		};
		parent.showName();
//		parent.showInfo();
	}
}
