package com.yedam.phonebook;

import java.text.ParseException;

import com.yedam.thread.synchronize.MainThread;

public class PhoneBookApp {
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();
		UserManager userManager = UserManager.getInstance();

		// 사용자권한 체크
		System.out.println("유저 정보를 확인하겠습니다.");

		int loginCount = 0;
		while (true) {
			System.out.println("아이디> ");
			String inputId = MenuViewer.keyboard.nextLine();
			System.out.println("비밀번호> ");
			String inputPw = MenuViewer.keyboard.nextLine();

			if (userManager.userCheck(inputId, inputPw)) {
				System.out.println("로그인 성공 : ");
				break;
			} else {
				loginCount++;
			}

			if (loginCount >= 3) {
				System.out.println("로그인 " + loginCount + "회 실패, 프로그램이 자동 종료됩니다.");
				return;
			} else {
				System.out.println("로그인 " + loginCount + "회 실패, 다시 로그인하여주십시오.");
			}
		}

		// userManager => userCheck(아이디, 비번)
		// 3번 연속으로 인증 실패할 경우 프로그램 종료

		int menu = 1;
		Thread thread = new MediaThread();
		
		while (true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (menu < Initmenu.PLAY || menu > Initmenu.EXIT) {
					throw new MenuChoiceException(menu); // 객체 생성 및 매개변수로 어떤 오류인지 그 번호를 저장하고 Catch문으로 들어간다.
				}

				if (menu == Initmenu.INPUT) {
					manager.inputData();
				} else if (menu == Initmenu.SEARCH) {
					manager.searchData();
				} else if (menu == Initmenu.DELETE) {
					manager.deleteData();
				} else if (menu == Initmenu.EXIT) {
					System.out.println("종료.");
					manager.storeToFile();
					thread.interrupt();
					break;
				} else if (menu == Initmenu.PLAY) {
					if (thread.isAlive() == false)
					{
						thread.start();
						System.out.println("플레이어 실행");
					}
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice(); // 위에서 생성해놓은 객체에 저장된 wrongChoice번호를 담아서 오류 메세지를 보낸다.
			} catch (Exception e) {
				MenuViewer.keyboard.nextLine();
				System.out.println("알맞은 메뉴항목을 다시 선택해주십시오.");
			}
		}
		System.out.println("end of prog");
	}
}
