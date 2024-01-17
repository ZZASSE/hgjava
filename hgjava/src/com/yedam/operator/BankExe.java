package com.yedam.operator;

import java.util.Scanner;

public class BankExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		int maxAddableCash = 100000;

		// 입금, 출금, 잔고 확인, 프로그램 종료
		while (run) {
			System.out.println("1.입금, 2.출금, 3.잔액, 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 입금
				balance = CashIn(balance, maxAddableCash);
				break;
			case 2: // 출금
				balance = CashOut(balance);
				break;
			case 3: // 잔액
				System.out.println("현재 잔액은 " + balance + "원 입니다.");
				break;
			case 4: // 종료
				break;
			default:
				break;
			}
		}
		System.out.println("end of prog.");
	}
	public static int CashIn(int _currentBalance, int _maxAddableCash)
	{
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("입금액>> 종료 원할 시 quit 입력");
			String input = scn.nextLine();

			if (input.equals("quit")) {
				break;
			} else {
				try {
					if (_currentBalance + Integer.parseInt(input) <= _maxAddableCash) {
						_currentBalance += Integer.parseInt(input);
						System.out.println("입금 완료 | 현재 잔액 : " + _currentBalance + "원");
					} else {
						System.out.println("최대 입금 가능 금액은 " + _maxAddableCash + "원 입니다.");
					}
				} catch (Exception e) {
					System.out.println("["+ e + "] 오류 입니다. 다시 입력해주세요.");
				}
			}
		}
		return _currentBalance;
	}
	public static int CashOut(int _currentBalance)
	{
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("출금액>> 종료 원할 시 quit 입력");
			System.out.println("현재 잔액 : " + _currentBalance + "원");
			String input = scn.nextLine();

			if (input.equals("quit")) {
				break;
			}

			try {
				if (_currentBalance - Integer.parseInt(input) >= 0) {
					_currentBalance -= Integer.parseInt(input);
					System.out.println("출금 완료 | 현재 잔액 : " + _currentBalance + "원");
				} else {
					System.out.println("예금액이 충분하지 않습니다.");
				}
			} catch (Exception e) {
				System.out.println("["+ e + "] 오류 입니다. 다시 입력해주세요.");
			}
		}
		return _currentBalance;
	}
}
