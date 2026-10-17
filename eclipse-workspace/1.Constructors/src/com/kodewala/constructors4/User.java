package com.kodewala.constructors4;

class SuperUser extends Object
{
	int age;
	
	SuperUser(int _age){
		super();
		
		this.age = _age;
		System.out.println("This is SuperUser Class. : " + age);
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
