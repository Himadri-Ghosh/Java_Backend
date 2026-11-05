 package com.kodewala.interface6;

public class DataCleaner 
{
	public void clean(Object obj)
	{
		if(obj instanceof Cleanable)
		{
			System.out.println("Allow to perform the data cleaning");
		}
		else
		{
			System.err.println("Not allowed to perform Data Cleaning");
		}
	}
}
