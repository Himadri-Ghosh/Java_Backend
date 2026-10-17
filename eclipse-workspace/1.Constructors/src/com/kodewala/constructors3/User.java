package com.kodewala.constructors3;

class SuperUser extends Object 
{
	
}

public class User extends SuperUser
{
	
	String userName;
	String userId;
	String mobile;
	
	User(String _userName, String _userId, String _mobile){
		
		this(100);
		
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
		
	}
	
	User(int age){
		this("Raju");
		System.out.println(" Age is : " + age);
		
	}
	User(String userName){
		System.out.println("Name is : " + userName);
		
	}

}
