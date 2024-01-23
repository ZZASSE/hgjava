package com.yedam.classes;

//담임선생님
public class HighStudentExe {
	public static void main(String[] args) {
		Student std = new HighStudent("T001", "홍길동", 80, 70, "박쌤");
		
		HighStudent hiStd = (HighStudent)std;
		System.out.println(hiStd.getTeacher());
		
		Student[] stdStudents = new Student[10];
		
		Student std1 = new Student("S003", "박석민", 80, 90);
		if (std1 instanceof HighStudent)
		{
			HighStudent hstd1 = (HighStudent) std1;
			System.out.println(hstd1.getTeacher());			
		}
	}
}
