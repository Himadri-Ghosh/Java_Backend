package com.kodewala.constructors7.Level3;

public class Child1 extends Parent1
{
	Child1()
	{
		super(30);
		System.out.println("This is Child1 Constructor");
	}

	public static void main(String[] args) 
	{
		Child1 child = new Child1();
	}

}
