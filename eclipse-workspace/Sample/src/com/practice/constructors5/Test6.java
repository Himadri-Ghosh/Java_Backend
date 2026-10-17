package com.practice.constructors5;

public class Test6 
{
	String name;
	int age;
	String location;
	
	Test6(String _name, int _age, String _location) 
	{
		this.name = _name;
		this.age = _age;
		this.location = _location;
	}
	
	public Test6() {
		this("Abhik", 38, "Pune");
	}
}
