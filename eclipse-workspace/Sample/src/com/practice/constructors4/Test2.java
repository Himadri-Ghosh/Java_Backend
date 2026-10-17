package com.practice.constructors4;

class SuperTest2 extends Object{
	
}

public class Test2 extends SuperTest2
{
	String name;
	String userId;
	String phoneNo;
	
	Test2(String _name, String _userId, String _phoneNo){
		this(11);
		this.name = _name;
		this.userId = _userId;
		this.phoneNo = _phoneNo;
	}
	
	Test2(int num){
		System.out.println("Serial No. :" + num);
	}
}
