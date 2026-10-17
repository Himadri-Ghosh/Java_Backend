// Constructor Overloading : You can have multiple constructors as long as their parameter lists are different.

package com.kodewala.constructors7.Level1;

public class Student4 
{
	String name;
	int age;
	
	Student4() 
	{
		System.out.println("This is No arguments constructor.");
	}
	
	Student4(String _name)
	{
		this.name = _name;
		System.out.println("This is One argument constructor.");
	}
	
	Student4(String _name, int _age)
	{
		this.name = _name;
		this.age = _age;
		System.out.println("This is Two way constructor.");
	}
}
