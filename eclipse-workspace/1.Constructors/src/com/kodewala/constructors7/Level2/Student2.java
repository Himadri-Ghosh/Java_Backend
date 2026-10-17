package com.kodewala.constructors7.Level2;

public class Student2 
{
	Student2() 
	{
		this("Himadri");
		System.out.println("This is 1st Constructor.");
	}
	
	Student2(String name){
		this(name, 24);
		System.out.println("This is 2nd Constructor.");
	}
	
	Student2(String name, int age)
	{
		System.out.println(name + " , " + age);
		System.out.println("This is 3rd Constructor");
	}
}
