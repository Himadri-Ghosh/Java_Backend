// super for Parent Variables

package com.kodewala.constructors7.Level5;

class Parent
{
	int age = 40;
		
}

public class Child extends Parent
{
	int age = 20;
	
	void display()
	{
		System.out.println(age);
		
		System.out.println(this.age);
		
		System.out.println(super.age);
	}
	
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.display();
	}

}
