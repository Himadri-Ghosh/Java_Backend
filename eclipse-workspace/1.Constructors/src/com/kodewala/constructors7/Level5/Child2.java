package com.kodewala.constructors7.Level5;

class Parent2
{
	void show() {
		System.out.println("Parent show()");
	}
}

public class Child2 extends Parent2
{
	void show() {
		System.out.println("Child show()");
		
		super.show();
	}
	
	public static void main(String[] args) 
	{
		Child2 child = new Child2();
		child.show();
	}

}
