package com.yedam.classed.inherit;

import lombok.Data;
import lombok.ToString;

@Data
public class CompFriend extends Friend{
	private String company;
	private String dept;
	
	@Override
	public void changeInfo(String info1, String info2) {
		company = info1;
		dept = info2;
	}
	@Override
	public String toString() {
		return super.toString() + ", 회사는 " + company + ", 부서는 " + dept;
	}
}
