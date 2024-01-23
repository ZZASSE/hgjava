package com.yedam.classed.inherit;

import lombok.Data;

@Data
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	@Override
	public void changeInfo(String info1, String info2) {
		this.univ = info1;
		this.major = info2;
	}
	@Override
	public String toString() {
		return super.toString() + ", 학교는 " + univ + ", 전공은 " + major;
	}
}
