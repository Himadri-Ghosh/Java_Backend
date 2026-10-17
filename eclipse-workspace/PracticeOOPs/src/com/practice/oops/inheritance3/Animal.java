package com.practice.oops.inheritance3;

public class Animal 
{
	String name;
	int age;
	
	Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void eat()
	{
		System.out.println("Animal is eatting");
	}
	
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
