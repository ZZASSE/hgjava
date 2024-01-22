package com.yedam.classes;

public class Student {
	// 필드
	private String sno;
	private String sname;
	private int score;
	private double height;

	// 생성자
	Student() {
	}

	Student(String _sno, String _sname, int _score, double _height) {
		sno = _sno;
		sname = _sname;
		score = _score;
		height = _height;
	}

	// 메서드
	void showInfo() {
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d입니다.\n", sno, sname, score);
	}

	String showInfoStr() {
		return "번호는 " + sno + " 입니다.";
	}

	// Get Set 함수
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
