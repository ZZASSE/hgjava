package com.yedam.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.todo.FriendInfo;

public class FriendExe 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		List<FriendInfo> friendInfoList = new ArrayList<FriendInfo>();

		while (run) 
		{
			
			try
			{
				System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료");
				int inputNum = Integer.parseInt(scanner.nextLine());
				
				switch (inputNum) 
				{
					case 1: // 등록
						System.out.println("이름 / 몸무게 / 점수 기입");
						FriendInfo newInfo = new FriendInfo(scanner.nextLine(), scanner.nextFloat(), scanner.nextInt());
						friendInfoList.add(newInfo);
						break;
					case 2: // 조회
						GetFriendInfo(friendInfoList);
						break;
					case 3: // 수정
						FriendInfo info = GetFriendInfo(friendInfoList);

						System.out.println("1. 이름 수정 2. 몸무게 수정 3. 점수 수정");
						int inputNum2 = Integer.parseInt(scanner.nextLine());

						switch (inputNum2) 
						{
							case 1:
								System.out.println("변경하시고자 하는 이름을 입력해주세요.");
								info.ChangeName(scanner.nextLine());
								break;
							case 2:
								System.out.println("변경하시고자 하는 몸무게를 입력해주세요.");
								info.ChangeWeight(scanner.nextFloat());
								break;
							case 3:
								System.out.println("변경하시고자 하는 점수를 입력해주세요.");
								info.ChangeScore(scanner.nextInt());
								break;
						}
						break;
					case 4: // 삭제
						FriendInfo info2 = GetFriendInfo(friendInfoList);
						for (int i = 0; i < friendInfoList.size(); ++i) 
						{
							if (friendInfoList.get(i).equals(info2)) 
							{
								friendInfoList.remove(info2);
								System.out.println("삭제 완료");
								break;
							}
						}
						break;
					case 5: // 입력 점수 이상인 친구
						System.out.println("조회 할 기준 점수를 입력해주세요.");
						int selectScore = scanner.nextInt();
						
						for(int i = 0; i < friendInfoList.size(); ++i)
						{
							FriendInfo info3 =  friendInfoList.get(i);
							if (selectScore < info3.score)
							{
								System.out.println(info3.name + " : " + info3.score);
							}
						}
						break;
					case 6: // 평균 점수, 최고 점수
						int avgScore = 0;
						int highestScore = 0;
						
						for(int i = 0; i < friendInfoList.size(); ++i)
						{
							avgScore += friendInfoList.get(i).score;
							
							if (highestScore < friendInfoList.get(i).score)
							{
								highestScore = friendInfoList.get(i).score;
							}
						}
						avgScore = Math.round((avgScore / friendInfoList.size() * 100) / 100.0f);
						
						System.out.println("평균 점수: " + avgScore + ", 최고 점수: " + highestScore);
						break;
					case 9: // 종료
						run = false;
						break;
				}
			} 
			catch (Exception e) 
			{
				System.out.println("[" + e + "] : 오류 발생");
			}
		}
		System.out.println("end of prog.");
	}

	public static FriendInfo GetFriendInfo(List<FriendInfo> _list) 
	{
		Scanner scanner = new Scanner(System.in);

		while (true) 
		{
			try 
			{
				boolean isExist = false;
				System.out.println("조회하고자 하는 사람의 이름을 입력하세요.");
				String name = scanner.nextLine();

				for (int i = 0; i < _list.size(); ++i) 
				{
					FriendInfo currentInfo = _list.get(i);

					if (currentInfo.name.equals(name)) 
					{
						isExist = true;
						System.out.println("찾았습니다." + 
											"\n이름: " + currentInfo.name + 
											"\n몸무게: " + currentInfo.weight + 
											"\n점수: " + currentInfo.score);
						return _list.get(i);
					}
				}

				if (!isExist) {
					System.out.println("해당 이름을 조회할 수 없습니다.");
				}
				return null;
			} 
			catch (Exception e) 
			{
				System.out.println("[" + e + "] : 오류 발생");
				return null;
			}
		}
	}
}
