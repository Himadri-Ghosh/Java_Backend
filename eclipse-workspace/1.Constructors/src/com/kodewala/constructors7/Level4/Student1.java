// Calling Parent Constructor + Current Constructor

package com.kodewala.constructors7.Level4;

public class Student1 extends Teacher1
{
	Student1() 
	{
		this("Himadri", 24);
		System.out.println("Student no argument constructor");
	}
	
	Student1(String name, int age)
	{
		super(name);
		System.out.println("Student parameterized constructor");
		System.out.println("Age : " + age);
	}
	
	
	public static void main(String[] args) 
	{
		Student1 student = new Student1();
	}

}
