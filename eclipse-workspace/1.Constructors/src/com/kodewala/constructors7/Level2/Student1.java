package com.kodewala.constructors7.Level2;

public class Student1 
{
	Student1() 
	{
		this(20);
		System.out.println("This is no argument Constructor");
	}
	
	Student1(int age)
	{
		System.out.println("Age : " + age);
	}
}
