package com.yedam.classed.inherit;

public class FriendApp {
	private Friend[] friends;

	public FriendApp() {
		friends = new Friend[10];
	}

	// CRUD
	public boolean add(Friend fnd) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] == null) {
				friends[i] = fnd;
				return true;
			}
		}
		return false;
	}

	// 목록, 이름(name)
	private int idx = 0;

	public Friend[] list(String name) {
		Friend[] list = new Friend[10];
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(name)) {
					list[idx++] = friends[i];
				}
			}
		}
		return list;
	}
	public void showAllList()
	{
		for(int i = 0; i < friends.length; ++i)
		{
			if (friends[i] != null)
			{
				friends[i].toString();
				System.out.println("");
			}
		}
	}

	// 전화번호(키) 단건조회
	public Friend getFriend(String phone) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] != null) {
				if (friends[i].getPhone().equals(phone)) {
					return friends[i];
				}
			}
		}
		return null;
	}

	// 수정.(전화번호 - 회사: 회사, 부서 / 학교: 학교, 전공)
	public boolean modify(String phone, String info1, String info2) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i].getPhone().equals(phone)) {
				friends[i].changeInfo(info1, info2);
				return true;
			}
		}
		return false;
	}

	// 삭제.(전화번호)
	public boolean remove(String phone) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i].getPhone().equals(phone)) {
				friends[i] = null;
				return true;
			}
		}
		return false;
	}
}
