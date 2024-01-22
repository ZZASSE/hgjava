package com.yedam.classes;

//학생 정보 관리 기능 구현
public class StudentApp {
	// 필드
	private Student[] students;

	// 생성자
	public StudentApp() {
		students = new Student[10];
	}

	// 메서드
	public boolean add(Student std) {
		for (int i = 0; i < students.length; ++i) {
			if (students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;
	}

	public Student[] list() {
		return students;
	}

	public boolean modify(String sno, int score) {
		for (int i = 0; i < students.length; ++i) {
			if (students[i] != null && students[i].getSno().equals(sno)) {
				students[i].setScore(score);
				return true;
			}
		}
		return false;
	}

	public boolean remove(String sno) {
		for (int i = 0; i < students.length; ++i) {
			if (students[i] != null && students[i].getSno().equals(sno)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	public Student get(String sno) {
		for (int i = 0; i < students.length; ++i) {
			if (students[i] != null && students[i].getSno().equals(sno)) {
				return students[i];
			}
		}
		return null;
	}
}
