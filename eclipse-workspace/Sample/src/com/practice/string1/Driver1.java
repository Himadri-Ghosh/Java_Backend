package com.practice.string1;

public class Driver1 {

	public static void main(String[] args) 
	{
		String firstName = "Rohit";  // SCP
		
		//String lastName = new String("Sharma");  // One object in SCP + one object in Heap
		
		//System.out.println(firstName == lastName); // It will checks the referance(address) of the object
		
		firstName = firstName.concat(" Ghosh");
		System.out.println(firstName);
	}

}
