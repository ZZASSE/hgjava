package com.yedam.todo;

public class Todo0117 {
	public static void main(String[] args) {
		//친구 3명의 이름과 연락처를 입력, 메세지 출력
		//입력완료
		
		// 이름 : 홍길동
		// 연락처 : 010 - 1111 - 2222
		//===========================
		// 이름 : 김길동
		// 연락처 : 010 - 2222 - 3333
		//===========================
		// 이름 : 박길동
		// 연락처 : 010 - 4444 - 5555
		//===========================
		
		//배열 생성
		FriendInfo[] friendInfos = {
					new FriendInfo("홍길동", "010 - 1111 - 2222"),
					new FriendInfo("김길동", "010 - 2222 - 3333"),
					new FriendInfo("박길동", "010 - 3333 - 5555") 
					};
		
 		for(FriendInfo info : friendInfos)
		{
	
		}
		for(int i = 0; i < friendInfos.length; ++i)
		{
			friendInfos[i].PrintInfo();
			System.out.println("==========================");
		}
	}
}
