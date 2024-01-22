package com.yedam.classes.friend;

//등록기능, 수정기능, 삭제기능, 목록, 단건조회 기능
public class FriendApp {
	//필드 : 친구정보를 저장할 수 있는 배열.
	private Friend[] friendArray;
	
	//생성자
	public FriendApp(int _arrayCount)
	{
		friendArray = new Friend[_arrayCount];
	}
	//함수
	public boolean Add(Friend _friend)
	{
		for(int i = 0; i < friendArray.length; ++i)
		{
			if (friendArray[i] == null)
			{
				friendArray[i] = _friend;
				return true;
			}
		}
		return false;
	}
	
	public boolean Remove(String _name)
	{
		for(int i = 0; i < friendArray.length; ++i)
		{
			if (friendArray[i] != null &&
				friendArray[i].getName().equals(_name))
			{
				friendArray[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Friend[] Get() {
		return friendArray;
	}
	
	public Friend GetFriend(String _name)
	{
		for(int i = 0; i < friendArray.length; ++i)
		{
			if (friendArray[i] != null && 
				friendArray[i].getName().equals(_name))
			{
				return friendArray[i];
			}
		}
		return null;
	}
}
