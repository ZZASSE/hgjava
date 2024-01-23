package com.yedam.classes;

//담임선생님
public class HighStudent extends Student{
	private String teacher;
	
	public HighStudent(String _sno, String _sname, int _score, double _height, String _teacher)
	{
		super(_sno, _sname, _score, _height);
		teacher = _teacher;
	}

	//Get Set
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
}
