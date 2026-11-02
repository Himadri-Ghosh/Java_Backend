package com.practice.interface5;

public interface IDog
{
	void eat();
	
	public default void running()
	{
		System.out.println("IDog.running().......IDOG");
	}
}
