package com.practice.oops.encapsulation1;

public class Student 
{
	public int age;
	
	public void setAge(int _age)
	{
		if(_age > 0)
		{
			this.age = _age;
		}
		else
		{
			System.out.println("Invalid Age !!!");
		}
	}
	
	public int getAge() {
		return age;
	}
}
