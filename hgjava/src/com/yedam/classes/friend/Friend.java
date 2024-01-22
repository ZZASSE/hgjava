package com.yedam.classes.friend;

//친구이름, 연락처, 나이: 관리
public class Friend {
	private String name;
	private String tel;
	private int age;
	
	//생성자
	public Friend()
	{
		
	}
	public Friend(String _name, String _tel, int _age)
	{
		name = _name;
		tel = _tel;
		age = _age;
	}
	//함수
	public void ShowInfo()
	{
		System.out.printf("이름: %s 전화번호: %s 나이: %d\n", name, tel, age);
	}
	//Get Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
