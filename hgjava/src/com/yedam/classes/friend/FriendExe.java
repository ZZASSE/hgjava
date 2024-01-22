package com.yedam.classes.friend;

import java.util.Scanner;

//메뉴 : 1.등록 2.목록 3.수정 4.삭제 9.종료
//사용자의 입력 처리결과 콘솔출력
public class FriendExe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = 10;
		FriendApp app = new FriendApp(arrayLength);
		boolean isRunning = true;
		
		while(isRunning)
		{
			String friendName = "";
			String friendTel = "";
			int friendAge = 0;
			Friend foundedFriend = null;
			
			try {
				System.out.println("사용자 입력>> 1.등록 2.목록 3.수정 4.삭제 9.종료");
				int input = Integer.parseInt(scanner.nextLine());
				
				switch (input) {
				case 1: //등록
					System.out.println("친구 이름 입력>>>");
					friendName = scanner.nextLine();
					System.out.println("친구 연락처 입력>>>");
					friendTel = scanner.nextLine();
					System.out.println("친구 나이 입력>>>");
					friendAge = Integer.parseInt(scanner.nextLine());
					if(app.Add(new Friend(friendName, friendTel, friendAge))) {
						System.out.println("등록 완료");
					}else {
						System.out.println("등록 실패");
					}
					break;
				case 2: //목록
					System.out.println("검색하고자하는 친구의 이름 입력>>>");
					friendName = scanner.nextLine();
					foundedFriend = app.GetFriend(friendName);
					if (foundedFriend != null)
					{
						foundedFriend.ShowInfo();
					}
					else {
						System.out.println("해당 친구의 정보가 없습니다.");
						break;
					}
					break;
				case 3: //수정
					System.out.println("수정하고자 하는 친구 정보의 친구 이름 입력>>>");
					friendName = scanner.nextLine();
					foundedFriend = app.GetFriend(friendName);
					if (foundedFriend != null)
					{
						System.out.println("찾았습니다. 수정하고자 하시는 정보의 번호를 입력하세요.\n1.이름 2.전화번호 3.나이");
						switch(Integer.parseInt(scanner.nextLine())) {
						case 1: //이름
							String prevName = foundedFriend.getName();
							System.out.println("변경하시고자 하는 친구의 이름을 입력해주세요.>>>");
							foundedFriend.setName(scanner.nextLine());
							System.out.println("변경이 완료되었습니다." + prevName + " => " + foundedFriend.getName());
							break;
						case 2: //전화번호
							String prevTel = foundedFriend.getTel();
							System.out.println("변경하시고자 하는 친구의 전화번호를 입력해주세요.>>>");
							foundedFriend.setTel(scanner.nextLine());
							System.out.println("변경이 완료되었습니다." + prevTel + " => " + foundedFriend.getTel());
							break;
						case 3: //나이
							int prevAge = foundedFriend.getAge();
							System.out.println("변경하시고자 하는 친구의 나이를 입력해주세요.>>>");
							foundedFriend.setAge(Integer.parseInt(scanner.nextLine()));
							System.out.println("변경이 완료되었습니다." + prevAge + " => " + foundedFriend.getAge());
							break;
						default:
							System.out.println("알 수 없는 정보입니다.");
							break;
						}
					}
					else {
						System.out.println("해당 친구의 정보를 찾지 못하였습니다.");
						break;
					}
					break;
				case 4: //삭제
					System.out.println("삭제하고자 하는 친구 정보의 친구 이름을 입력>>>");
					friendName = scanner.nextLine();
					
					if(app.Remove(friendName))
					{
						System.out.println("삭제 완료");
					}else {
						System.out.println("삭제 실패");
					}
					break;
				case 9: //종료
					isRunning = false;
					System.out.println("프로그램 종료");
					break;
				}
			}catch (Exception e) {
				System.out.println("[" + e + "] 오류 발생");
				friendName = "";
				friendTel = "";
				friendAge = 0;
				foundedFriend = null;
			}
		}
	}
}
