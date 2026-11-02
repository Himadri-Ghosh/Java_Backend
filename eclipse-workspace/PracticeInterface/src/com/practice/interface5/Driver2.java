package com.practice.interface5;

public class Driver2 {

	public static void main(String[] args) 
	{
		IAnimal dog = new Labrador();
		
		dog.bark();
		dog.running();
	}

}
