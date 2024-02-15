package com.yedam.phonebook;

public class PhoneInfo {
	private String name;
	private String phone;

	public PhoneInfo(String _name, String _phone) {
		name = _name;
		phone = _phone;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
	@Override
	public String toString() {
		return InputSelect.NORMAL + "," + name + "," + phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
}
