package com.kodewala.hotstar;

public class User 
{
	String userId;
	String userName;
	String type;
	public static int liveUserCount = 0;
	
	public User(String _userId, String _userName, String _type) {
//		super();
		this("ksahsm", "73920");
		this.userId = _userId;
		this.userName = _userName;
		this.type = _type;
	}
	
	public User(String _userName, String _type) {
		super();
		this.userName = _userName;
		this.type = _type;
	}
	
	{
		liveUserCount += 1;
	}
	
	
}
