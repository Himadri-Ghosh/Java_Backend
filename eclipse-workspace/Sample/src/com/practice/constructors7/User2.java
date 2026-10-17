package com.practice.constructors7;

public class User2 
{
	String name;
	String mobile;
	String country;
	
	User2(String _name, String _mobile, String _country)
	{
		this.name = _name;
		this.country = _country;
		this.mobile = _mobile;
	}
	
	User2(){
		this("Rohit", "INDIA", "923733838");
	}
}
