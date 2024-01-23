package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeList {
	// 싱글톤 객체 생성
	private static EmployeeList instance = new EmployeeList();

	public static EmployeeList getInstance() {
		return instance;
	}

	Employee[] list;
	int empNum; // 사원 수
	Scanner scanner = new Scanner(System.in);

	private EmployeeList() {

	}

	// 사원 수 입력 초기화
	public void init() {
		System.out.print("사원 수>> ");
		int num = scanner.nextInt();
		list = new Employee[num];
	}

	// 사원 정보 입력 => 배열 추가
	public void Input() {
		if (empNum == list.length) {
			System.out.println("입력초과");
			return;
		}

		System.out.printf("%d 사번", empNum);
		int no = scanner.nextInt();

		System.out.print("이름> ");
		String name = scanner.next();

		System.out.print("급여> ");
		int sal = scanner.nextInt();

		list[empNum++] = new Employee(no, name, sal);
	}

	// 사번에 해당하는 이름 출력
	public String search(int _empId) {
		// 해당 사번이 있으면 반환
		for (int i = 0; i < list.length; ++i) {
			if (list[i] != null) {
				if (list[i].getEmployeeId() == _empId) {
					return list[i].getName();
				}
			}
		}
		return "";
	}

	// 전체 출력
	public void Print() {
		for (int i = 0; i < list.length; ++i) {
			if (list[i] != null) {
				// 사원번호 이름 급여 출력
				System.out.printf("%3d %4s %4d", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
				System.out.println("");
			}
		}
	}
	//급여 합계
	public int sum() {
		int sum = 0;
		for(int i = 0; i < list.length; ++i)
		{
			if (list[i] != null)
			{
				sum += list[i].getSalary();
			}
		}
		return sum;
	}
}
