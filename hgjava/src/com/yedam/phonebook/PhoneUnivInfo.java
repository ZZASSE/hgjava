package com.yedam.phonebook;

public class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;
	
	public PhoneUnivInfo(String _name, String _phone, String _major, int _year)
	{
		super(_name, _phone);
		major = _major;
		year = _year;
	}
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
	@Override
	public String toString() {
		return InputSelect.UNIV + "," + getName() + "," + getPhone() + "," + major + "," + year;
	}
}
