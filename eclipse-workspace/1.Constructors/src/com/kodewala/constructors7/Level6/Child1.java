// Multi-Level Constructor Chaining

package com.kodewala.constructors7.Level6;

class GrandParent1
{
	GrandParent1() {
		System.out.println("GrandParent");
	}
}

class Parent1 extends GrandParent1
{
	Parent1()
	{
		System.out.println("Parent");
	}
}

public class Child1 extends Parent1
{
	Child1()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) 
	{
		Child1 child = new Child1();
	}

}
