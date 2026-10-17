package com.practice.constructors6;

public class Test2 extends Test3
{
	String location;
	
	Test2(String _name, int _age, String _location, String _dept)
	{
		super(_name, _age, _dept);
		this.location = _location;
	}
}
