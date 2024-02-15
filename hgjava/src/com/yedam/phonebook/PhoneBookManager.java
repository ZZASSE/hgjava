package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

//생성자(초기화), 등록, 검색, 삭제, 종료(파일에 저장)
public class PhoneBookManager {
	private File dataFile = new File("c:/temp/phonebook.txt");
	HashSet<PhoneInfo> storage = new HashSet<PhoneInfo>();
	// 싱글톤
	private static PhoneBookManager instance;

	private PhoneBookManager() {
		// 초기화 작업
		readFromFile();
	}

	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}

	// 초기화
	public void readFromFile() {
		if (dataFile.exists() == false) {
			return; // 메서드 종료
		}

		try {
			// 있으면 파일을 읽어오기
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			PhoneInfo info = null;
			while ((str = br.readLine()) != null) {
				String[] record = str.split(",");
				int type = Integer.parseInt(record[0]);
				switch (type) {
				case InputSelect.NORMAL:
					info = new PhoneInfo(record[1], record[2]);
					break;
				case InputSelect.COMPANY:
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				case InputSelect.UNIV:
					info = new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
					break;
				}
				storage.add(info);
			} // end of while
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//저장
	public void storeToFile() {
		try {
			FileWriter fr = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = storage.iterator();
			
			while(iter.hasNext())
			{
				PhoneInfo info = iter.next();
				fr.write(info.toString() + "\n");
				
			}
			fr.flush();
			fr.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	//메서드 1, 2, 3
	private PhoneInfo getFriendInfo() {
		System.out.println("이름> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처> ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	private PhoneCompanyInfo getCompanyFriendInfo() {
		System.out.println("이름> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
	private PhoneUnivInfo getUnivFriendInfo() {
		System.out.println("이름> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("학년");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	//추가
	public void inputData() {
		System.out.println("구분");
		System.out.println("1.일반 2.회사 3.학교");
		System.out.print("선택>>> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		PhoneInfo info = null;
		switch (choice) {
		case InputSelect.NORMAL:
			info = getFriendInfo();
			break;
		case InputSelect.COMPANY:
			info = getCompanyFriendInfo();
			break;
		case InputSelect.UNIV:
			info = getUnivFriendInfo();
			break;
		}
		
		if (storage.add(info))
		{
			System.out.println("등록완료");
		}
		else {
			System.out.println("등록실패");
		}
	}
	//검색
	public void searchData()
	{
		//이름 입력 받아서 검색하고 출력
		System.out.println("이름입력>");
		String inputValue = MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> iter = storage.iterator();
		while(iter.hasNext())
		{
			PhoneInfo result = iter.next();
			if (result.getName().equals(inputValue))
			{
				System.out.println(result.toString());
				break;
			}
		}
	}
	//삭제
	public void deleteData()
	{
		//이름 입력 받아서 검색하고 삭제
		System.out.println("이름입력>");
		String inputValue = MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> iter = storage.iterator();
		while(iter.hasNext())
		{
			PhoneInfo result = iter.next();
			if (result.getName().equals(inputValue))
			{
				if( storage.remove(result))
				{
					System.out.println("삭제완료");
				}
				else {
					System.out.println("삭제실패");
				}
				break;
			}
		}
	}
}
