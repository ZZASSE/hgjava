package com.yedam.classed.inherit;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
		// 사용자 입력 / 처리 결과 출력 => 컨트롤
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		FriendApp app = new FriendApp();

		while (run) {
			System.out.println("1.등록 2.조회 3.단건조회 4.수정 5.삭제 9.종료");
			int menu = 0;
			
			while(true) {
				try {
					menu = Integer.parseInt(scanner.nextLine());
					break;
					
				} catch (NumberFormatException ne) {
					System.out.println("숫자만 기입");
				}				
			}

			switch (menu) {
			case 1: // 등록 1)이름 연락처 2)학교친구 3)회사친구
				System.out.println("1.친구 2.학교친구 3.회사친구");
				
				int subMenu = 0;
				
				while(true)
				{
					try {
						subMenu = Integer.parseInt(scanner.nextLine());
						break;
						
					} catch (NumberFormatException ne) {
						System.out.println("숫자만 기입");
					}
				}

				System.out.println("이름>>> ");
				String name = scanner.nextLine();
				System.out.println("연락처>>> ");
				String phone = scanner.nextLine();

				Friend friend = null;
				if (subMenu == 1) {
					friend = new Friend();
					friend.setName(name);
					friend.setPhone(phone);
				} else if (subMenu == 2) {
					UnivFriend univFriend = new UnivFriend();
					univFriend.setName(name);
					univFriend.setPhone(phone);
					
					System.out.println("학교>>> ");
					String univ = scanner.nextLine();
					System.out.println("전공>>> ");
					String major = scanner.nextLine();
					
					univFriend.setUniv(univ);
					univFriend.setMajor(major);
					
					friend = univFriend;
					
				} else if (subMenu == 3) {
					CompFriend compFriend = new CompFriend();
					compFriend.setName(name);
					compFriend.setPhone(phone);
					
					System.out.println("회사>>> ");
					String comp = scanner.nextLine();
					System.out.println("부서>>> ");
					String dept = scanner.nextLine();
					
					compFriend.setCompany(comp);
					compFriend.setDept(dept);
					
					friend = compFriend;
				}
				if (app.add(friend)) {
					System.out.println("등록 완료");
				}else {
					System.out.println("등록 실패");
				}
				break;
			case 2: // 목록 (이름)
				System.out.println("조회 할 이름>>> ");
				String fname = scanner.nextLine();
				if (fname.equals(""))
				{
					app.showAllList();
				}
				else {
					Friend[] list = app.list(fname);
					for(int i = 0; i < list.length; ++i)
					{
						if (list[i] != null) {
							System.out.println(list[i].toString());
						}
					}					
				}
				break;
			case 3: // 단건 조회 (전화번호)
				System.out.println("조회 할 정보의 전화번호>>> ");
				String fphone = scanner.nextLine();
				Friend friend2 = app.getFriend(fphone);
				if (friend2 != null)
				{
					friend2.toString();
					System.out.println("");
				}
				else {
					System.out.println("해당하는 정보를 찾지 못하였습니다.");
				}
				break;
			case 4: // 수정 (전화번호)
				System.out.println("수정 할 정보의 전화번호>>> ");
				String fphone2 = scanner.nextLine();
				System.out.println("수정 할 정보1 회사 혹은 학교>>> ");
				String cInfo1 = scanner.nextLine();
				System.out.println("수정 할 정보2 부서 혹은 전공>>> ");
				String cInfo2 = scanner.nextLine();
				if(app.modify(fphone2, cInfo1, cInfo2))
				{
					System.out.println("수정 완료");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 5: // 삭제 (전화번호)
				System.out.println("삭제 할 정보의 전화번호>>> ");
				if (app.remove(scanner.nextLine()))
				{
					System.out.println("삭제 완료");
				}///
				else {
					System.out.println("삭제 실패");
				}
				break;
			case 9: //종료
				System.out.println("종료합니다.");
				run = false;

			}
		}
		System.out.println("end of prog");
	}
}
