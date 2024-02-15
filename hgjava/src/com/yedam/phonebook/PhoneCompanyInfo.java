package com.yedam.phonebook;

public class PhoneCompanyInfo extends PhoneInfo{
	private String company;
	
	public PhoneCompanyInfo(String _name, String _phone, String _company) {
		super(_name, _phone);
		company = _company;
	}
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}
	@Override
	public String toString() {
		return InputSelect.COMPANY + "," + getName() + "," + getPhone() + "," + company;
	}
}
