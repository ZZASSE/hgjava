package com.yedam.phonebook;

//사용자 메뉴를 비정상적으로 처리했을 때 보여줄 예외를 구현하기 위해 만듬
public class MenuChoiceException extends Exception{
	int wrongChoice;
	
	public MenuChoiceException(int _wrongChoice) {
		super("없는 메뉴번호입니다.");
		this.wrongChoice = _wrongChoice;
	}
	public void showWrongChoice()
	{
		System.out.println(wrongChoice + "잘못된 접근입니다.");
	}
}
