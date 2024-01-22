package com.yedam.classes;

//실행을 위한 클래스 => main 메서드 있어야한다
public class StudentExe 
{
	public static void main(String[] args) {
		Student s1 = new Student("S001", "홍길동", 80, 178.9);
		Student s2 = new Student("S002", "김길동", 85, 147);
		Student s3 = new Student("S003", "최길동", 95, 182);
	}
}
