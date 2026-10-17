package com.practice.constructors7;

class SuperUser extends Object
{
	int number;
	
	SuperUser(int _number){
		super();
		this.number = _number;
		System.out.println("Number : "+number);
	}
}

public class User extends SuperUser
{
	String userName;
	String userId;
	String mobile;
	
	User(String _userName, String _userId, String _mobile)
	{
		super(200);
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
}
