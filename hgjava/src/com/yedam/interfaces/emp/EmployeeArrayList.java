package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.classes.singleton.Employee;

// ArrayList<Employee>
public class EmployeeArrayList implements EmployeeList {

	// 싱글톤
	private static EmployeeArrayList instance = new EmployeeArrayList();
	private EmployeeArrayList() {}
	public static EmployeeArrayList getInstance() {return instance;}

	// 필드
	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		System.out.printf("%d 사번", list.size());
		int no = scn.nextInt();

		System.out.print("이름> ");
		String name = scn.next();

		System.out.print("급여> ");
		int sal = scn.nextInt();

		list.add(new Employee(no, name, sal));
	}

	@Override
	public String search(int _empId) {
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) != null && 
				list.get(i).getEmployeeId() == _empId) {
				return list.get(i).getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) != null) {
				// 사원번호 이름 급여 출력
				System.out.printf("%3d %4s %4d", 
						list.get(i).getEmployeeId(), 
						list.get(i).getName(),
						list.get(i).getSalary());
				System.out.println("");
			}
		}
	}

	@Override
	public int sum() {
		int sum = 0;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) != null) {
				sum += list.get(i).getSalary();
			}
		}
		return sum;
	}

}
