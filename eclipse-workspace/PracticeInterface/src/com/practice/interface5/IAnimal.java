package com.practice.interface5;

public interface IAnimal 
{
	void bark();
	
	public default void running()
	{
		System.out.println("IAnimal.running().........IAnimal");
	}
}
