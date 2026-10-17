package com.kodewala.constructors7.Level6;

public class Child2 extends Parent2
{
	Child2(String name)
	{
		super("Sukumar");
		System.out.println("Child : " + name);
	}
	
	public static void main(String[] args) 
	{
		Child2 c = new Child2("Rohit");
		
	}

}