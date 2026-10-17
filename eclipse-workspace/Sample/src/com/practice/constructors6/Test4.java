package com.practice.constructors6;

public class Test4 
{
	public static void main(String args[]) {
		Test5 test5 = new Test5("Gaurav", 27, "Electrical", "Kharagpur");
		
		System.out.println("Name : " + test5.name);
		System.out.println("Age : " + test5.age);
		System.out.println("Department : " + test5.dept);
		System.out.println("Location : " + test5.location);
	}
}
