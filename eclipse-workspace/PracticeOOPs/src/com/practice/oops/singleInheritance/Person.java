package com.practice.oops.singleInheritance;

public class Person 
{
	String name;
	int age;
	
	Person(String _name, int _age)
	{
		this.name = _name;
		this.age = _age;
	}
	
	void displayPersonDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
