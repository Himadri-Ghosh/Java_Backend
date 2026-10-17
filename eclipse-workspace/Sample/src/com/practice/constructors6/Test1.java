package com.practice.constructors6;

public class Test1 
{
	public static void main(String args[])
	{
		Test2 test2 = new Test2("Pritam", 28, "Kolkata", "Electronics");
		
		System.out.println("Name : " + test2.name);
		System.out.println("Age : " + test2.age);
		System.out.println("Department : " + test2.dept);
		System.out.println("Location : " + test2.location);
	}
}
