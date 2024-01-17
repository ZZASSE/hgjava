package com.yedam.todo;

public class Todo117 {
	public class FriendInfo{
		public String name;
		public String tel;
		public FriendInfo(String _name, String _tel)
		{
			name = _name;
			tel = _tel;
		}
	}
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
		FriendInfo[] friendInfos = new FriendInfo[3];
		
//		friendInfos[0] = new FriendInfo("홍길동", "010 - 1111 - 2222"); 
//		friendInfos[1] = new FriendInfo("김길동", "010 - 2222 - 3333"); 
//		friendInfos[2] = new FriendInfo("박길동", "010 - 3333 - 5555"); 
	}
}
