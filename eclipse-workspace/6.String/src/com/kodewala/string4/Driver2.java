package com.kodewala.string4;

public class Driver2 
{
	public static void main(String args[])
	{
		String s1 = new String("Kodewala"); //SCP + HEAP
		String s3 = new String("Kodewala"); // HEAP
		
		String s2 = s1.concat(" Kodewala");
		
		System.out.println(s2);
	}
}
