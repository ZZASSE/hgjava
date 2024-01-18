package com.yedam.todo;

public class FriendInfo {
	public String name;
	public String tel;
	public float weight;
	public int score;
	
	//생성자들
	public FriendInfo(String _name, String _tel)
	{
		name = _name;
		tel = _tel;
	}
	public FriendInfo(String _name, float _weight, int _score)
	{
		name = _name;
		weight = _weight;
		score = _score;
	}
	
	//함수들
	public void PrintInfo()
	{
		System.out.println("이름 : " + name + "\n연락처 : " + tel);
	}
	public void ChangeName(String _name)
	{
		String prevName = name;
		name = _name;
		System.out.println("이름 변경 완료: " + prevName + " => " + name);;
	}
	public void ChangeWeight(float _weight)
	{
		float prevWeight = weight;
		weight = _weight;
		System.out.println("몸무게 변경 완료: " + prevWeight + " => " + weight);
	}
	public void ChangeScore(int _score)
	{
		int prevScore = score;
		score = _score;
		System.out.println("점수 변경 완료: " + prevScore + " => " + score);
	}
}
