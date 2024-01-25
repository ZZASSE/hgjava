package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storgeEmployees = new ArrayList<Employee>();
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 9.종료");

			int menuInput = 0;
			while (true) {
				try {
					menuInput = Integer.parseInt(scn.nextLine());
					break;
				} catch (Exception e) {
					System.out.println("입력값 부정확");
				}
			}

			switch (menuInput) {
			case 1: // 등록
				System.out.println("사번 이름 입사일자 급여 순서대로 입력>>> ");
				String inputInfo = scn.nextLine();

				Employee newEmployee = insert(inputInfo);

				if (newEmployee != null) {
					storgeEmployees.add(newEmployee);
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}
				break;
			case 2: // 조회(입사일자)
				System.out.println("조회: 입사연도-월-일 순서대로 입력>>> ");
				String inputHireInfo = scn.nextLine();
				showInfo(storgeEmployees, inputHireInfo);
				break;
			case 9:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}

		System.out.println("end of prog");
	}

	public static Employee insert(String _inputInfo) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-mm-dd");
		String[] valAry = _inputInfo.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}

		try {
			return new Employee(Integer.parseInt(valAry[0]), 
								valAry[1], 
								simpleDateFormat.parse(valAry[2]),
								Integer.parseInt(valAry[3]));
		} catch (Exception e) {
			return null;
		}
	}

	public static void showInfo(List<Employee> _list, String _hireDate) {
		boolean isExist = false;
		for (int i = 0; i < _list.size(); ++i) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-mm-dd");
			try {
				Date date = simpleDateFormat.parse(_hireDate);
				int compareResult = _list.get(i).getHireData().compareTo(date);

				// 동일한 날짜 찾기
				if (compareResult == 0) {
					isExist = true;
					System.out.println(_list.get(i).toString());
				}
			} catch (Exception e) {
			}
		}
		if (isExist == false) {
			System.out.println("일치하는 정보가 없습니다.");
		}
	}
}
