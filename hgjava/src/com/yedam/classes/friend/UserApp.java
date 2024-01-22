package com.yedam.classes.friend;

class User {
	private String id;
	private String pw;
	private String name;
	
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	// Get Set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class UserApp {
	private User[] users;

	public UserApp() {
		users = new User[5];
		users[0] = new User("user1", "1111", "홍길동");
		users[0] = new User("user2", "2222", "김길동");
		users[0] = new User("user2", "3333", "박길동");
	}
	public boolean login(String id, String pw) {
		for(int i = 0; i < users.length; ++i) {
			if (users[i] != null) {
				if (users[i].getId().equals(id) &&
					users[i].getPw().equals(pw)) {
					return true;
				}
			}
		}
		return false;
	}
}
