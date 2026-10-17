package com.practice.objects.staticBlock;

class ParentUser1
{
	ParentUser1(){
		System.out.println("This is from ParentUser1 constructor");
	}
}

public class User1 extends ParentUser1
{
	String userName;
	String userId;
	String phoneNo;
	
//	we can write the static block anywhere inside the constructor.
//	when any user call the constructor static block is executed first
	static
	{
		System.out.println("This is from static block");
	}
	
	public User1(String _userName, String _userId, String _phoneNo)
	{
		this.userName = _userName;
		this.userId = _userId;
		this.phoneNo = _phoneNo;
		
		System.out.println("User1() is calling");
	}
}
