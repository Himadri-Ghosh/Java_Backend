package com.kodewala.constructors7.Level3;

class Animal1
{
	Animal1()
	{
		System.out.println("This is Parent Constructor.");
	}
}

class Dog1 extends Animal1
{
	Dog1()
	{
		super();
		System.out.println("This is Child Constructor.");
	}
}
