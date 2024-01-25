package com.yedam.api;

public class Member {
	String name;
	int age;

	Member()
	{
		
	}
	Member(String _name, int _age){
		this.name = _name;
		this.age = _age;
	}
	// name같으면 논리적으로 동일한 객체
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member target = (Member)obj;
			if (this.name.equals(target.name) &&
				this.age == target.age) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public String toString()
	{
		return "이름은 " + name + ", 나이는 " + age;
	}
}
