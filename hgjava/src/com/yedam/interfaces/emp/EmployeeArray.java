package com.yedam.interfaces.emp;

import java.util.Scanner;

import com.yedam.classes.singleton.Employee;

//배열 Employee[]
public class EmployeeArray implements EmployeeList {

	// 싱글톤
	private static EmployeeArray instance = new EmployeeArray();
	private EmployeeArray() {}
	public static EmployeeArray getInstance() {return instance;}

	// 필드
	Employee[] array;
	int empNum;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		System.out.println("사원수>> ");
		int num = scn.nextInt();
		array = new Employee[num];
		empNum = 0;
	}

	@Override
	public void input() {
		if (empNum == array.length) {
			System.out.println("입력초과");
			return;
		}

		System.out.printf("%d 사번", empNum);
		int no = scn.nextInt();

		System.out.print("이름> ");
		String name = scn.next();

		System.out.print("급여> ");
		int sal = scn.nextInt();

		array[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public String search(int _empId) {
		// 해당 사번이 있으면 반환
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != null) {
				if (array[i].getEmployeeId() == _empId) {
					return array[i].getName();
				}
			}
		}
		return "";
	}

	@Override
	public void print() {
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != null) {
				// 사원번호 이름 급여 출력
				System.out.printf("%3d %4s %4d", 
						array[i].getEmployeeId(), 
						array[i].getName(), 
						array[i].getSalary());
				System.out.println("");
			}
		}
	}

	@Override
	public int sum() {
		int sum = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != null) {
				sum += array[i].getSalary();
			}
		}
		return sum;
	}

}
