package com.practice.oops.singleInheritance;

public class Student extends Person
{
	String roll;
	
	Student(String _name, int _age, String _roll)
	{
		super(_name, _age);
		this.roll = _roll;
	}
	
	void displayStudentDetails()
	{
		displayPersonDetails();
		System.out.println("Roll No : " + roll);
	}
}
