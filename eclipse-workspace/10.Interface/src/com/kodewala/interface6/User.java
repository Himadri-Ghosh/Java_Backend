package com.kodewala.interface6;

public class User implements Cleanable
{
	String userName;
	String userId;
	
	public User(String userName, String userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}
	
}
