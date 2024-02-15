package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


//기능은 c:/temp/userList.txt 에 저장된 아이디 / 비번을 이용
public class UserManager {
	private File dataFile = new File("c:/temp/userList.txt");
	public List<UserInfo> userInfoList = new ArrayList<UserInfo>();

	// 싱글톤
	private static UserManager instance;

	private UserManager() {
		// 초기화 작업
		readFromFile();
		
		for(int i = 0; i < userInfoList.size(); ++i)
		{
			System.out.println(userInfoList.get(i).toString());
		}
	}

	public static UserManager getInstance() {
		if (instance == null) {
			instance = new UserManager();
		}
		return instance;
	}

	//초기화
	public void readFromFile() {
		if (dataFile.exists() == false) {
			return; // 메서드 종료
		}

		try {
			// 있으면 파일을 읽어오기
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			
			while ((str = br.readLine()) != null) {
				String[] record = str.split(" ");
				userInfoList.add(new UserInfo(record[0], record[1], record[2]));
			} // end of while
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//유저정보 검색 및 반환
	public boolean userCheck(String _id, String _pw)
	{
		for(int i = 0; i < userInfoList.size(); ++i)
		{
			if (userInfoList.get(i) != null &&
				userInfoList.get(i).getId().equals(_id) &&
				userInfoList.get(i).getPw().equals(_pw))
			{
				return true;
			}
		}
		return false;
	}
}
