package com.practice.oops.inheritance3;

public class Dog extends Animal
{
	Dog(String name, int age)
	{
		super(name, age);
	}
	
	public void bark()
	{
		System.out.println("Dog is barking");
	}
	
	public void showDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		eat();
		sleep();
		bark();
	}
}


