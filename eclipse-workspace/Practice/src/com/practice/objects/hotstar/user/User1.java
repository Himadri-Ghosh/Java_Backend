package com.practice.objects.hotstar.user;

public class User1 
{
	String userId;
	String userName;
	String type;
	
	public static int liveUserCount = 0;
	
	public User1(String userId, String userName, String type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.type = type;
	}
	
	public User1(String userName, String type) {
		super();
		this.userName = userName;
		this.type = type;
	}
	
	{
		liveUserCount += 1;
	}
	
}
