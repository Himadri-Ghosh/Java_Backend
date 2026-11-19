package com.kodewala.exception5;

public class Driver {

	public static void main(String[] args) 
	{
		String name = null;
//		System.out.println(name.length()); // NullPointerException
		
		String className = "com.kodewala.exception5.Driverhhg";
		try
		{
			Class.forName(className);  // Loading the class into memory
			System.out.println("Class Loaded......");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
