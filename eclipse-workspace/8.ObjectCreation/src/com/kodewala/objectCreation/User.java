package com.kodewala.objectCreation;

public class User 
{
	String userName;
	String userId;
	String mobileNumber;
	
//	Static block will get executed just after the class loading
	static
	{
		System.out.println("I am in static init block");
	}
	
//	How many times you call the constructor, the static block is called only once
	
	public User(String _userName, String _userId, String _mobileNumber) {
		super();
		System.out.println("String _userName, String _userId, String _mobileNumber");
		this.userName = _userName;
		this.userId = _userId;
		this.mobileNumber = _mobileNumber;
	}
}
