package com.yedam.classes;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		StudentApp app = new StudentApp();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		String sno = "", sname = "";
		int score = 0;
		double height = 0;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scanner.nextLine());

			switch (menu) {
			case 1: // 등록 기능
				System.out.println("학생번호>>> ");
				sno = scanner.nextLine();
				System.out.println("학생이름>>> ");
				sname = scanner.nextLine();
				System.out.println("학생점수>>> ");
				score = Integer.parseInt(scanner.nextLine());
				System.out.println("학생키>>> ");
				height = Double.parseDouble(scanner.nextLine());
				// 매개값으로 사용
				Student std = new Student(sno, sname, score, height);
				if (app.add(std)) {
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}
				break;
			case 2: // 목록 출력
				Student[] list = app.list();
				for (int i = 0; i < list.length; ++i) {
					if (list[i] != null) {
						list[i].showInfo();
					}
				}
				System.out.println("조회 완료");
				break;
			case 3: // 수정
				System.out.println("학생번호>>> ");
				sno = scanner.nextLine();
				//정상 학번 입력 유무
				if (app.get(sno) == null) {
					System.out.println("올바른 학생번호를 입력해주세요.");
					break;
				}
				// 정상 점수 입력 유무
				while (true) {
					System.out.println("학생점수>>> ");
					score = Integer.parseInt(scanner.nextLine());
					if (score < 0) {
						System.out.println("점수는 0점 이상이어야 합니다.");
						continue;
					}
					break;
				}

				if (app.modify(sno, score)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}
				break;
			case 4: // 삭제
				System.out.println("학생번호>>> ");
				sno = scanner.nextLine();
				if (app.remove(sno)) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 9: // 종료
				run = false;
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
