package com.practice.constructors5;

public class Test3 
{
	String name;
	int age;
	String location;
	
	Test3(String _name, int _age, String _location)
	{
		this.name = _name;
		this.age = _age;
		this.location = _location;
	}
	
	public Test3() {
		this("Rohit", 24, "Newtown, Kolkata");
	}
}
