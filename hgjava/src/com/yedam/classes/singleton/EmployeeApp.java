package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeList app = EmployeeList.getInstance();

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int menu = 0;

		while (run) {
			System.out.println("1.사원수 2.사원입력 3.사원리스트 4.검색 5.급여합계 9.종료");
			System.out.print("선택> ");
			menu = scanner.nextInt();

			if (menu == 1) {
				app.init();
			} else if (menu == 2) {
				app.Input();
			} else if (menu == 3) {
				app.Print();
			} else if (menu == 4) {
				System.out.print("조회할 사번>> ");
				int no = scanner.nextInt();
				if (app.search(no).equals("")) {
					System.out.println("해당하는 사원 정보가 없습니다.");
				} else {
					System.out.println(app.search(no));
				}
			} else if (menu == 5) {
				System.out.printf("급여의 합계는 %d 입니다.\n", app.sum());
			} else if (menu == 9) {
				run = false;
			} else {
				System.out.println("잘못된 번호입니다.");
			}

		}
		System.out.println("end of prog.");
	}
}
