// super() with Parameter

package com.kodewala.constructors7.Level3;

class Animal2
{
	Animal2(String name)
	{
		System.out.println("Animal : " + name);
		System.out.println("This is Parent Constructor.");
	}
}

class Dog2 extends Animal2
{
	Dog2() {
		super("Tommy");
		System.out.println("This is Child Constructor.");
	}
}
