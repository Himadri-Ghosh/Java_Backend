package com.practice.interface5;

public class Labrador implements IAnimal, IDog
{

	@Override
	public void bark()
	{
		System.out.println("barking");
	}
	
	@Override
	public void eat()
	{
		System.out.println("eating");
	}
	
	@Override
	public void running()
	{
		IAnimal.super.running();
		
		IDog.super.running();
	}
}
