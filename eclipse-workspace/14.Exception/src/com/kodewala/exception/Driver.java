package com.kodewala.exception;

public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Driver.main()........START");
		
//		Null Pointer Exception :
		
//		String name = null;
//		
//		System.out.println("TO----DO");
//		System.out.println("TO----DO");
//		System.out.println("TO----DO");
//		System.out.println("TO----DO");
//		
//		System.out.println(name.length());
		
//		ArrayIndexOutOfBoundsException :
		
//		String name = args[0];
//		String address = args[1];
//		
//		System.out.println(name);
//		System.out.println(address);
		
//		ArithmeticException : 
		
//		int marks = 100;
//		int part = 0;
//		int total = marks / part;
//		
//		System.out.println(total);
		
//		NumberFormatException :
		
		String name = args[0];
		
		int marks = Integer.parseInt(args[1]);
		
		System.out.println(name);
		System.out.println(marks);
		
		System.out.println("Driver.main()........END");
	}

}
