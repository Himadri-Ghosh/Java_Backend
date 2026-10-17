package com.practice.constructors4;

class SuperUser extends Object
{
	SuperUser(int age)
	{
		super();
		System.out.println("Age : " + age);
	}
}

public class User extends SuperUser
{
	String userName;
	String userId;
	String mobile;
	
	User(String _userName, String _userId, String _mobile)
	{
		super(30);
		
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}

}
