package com.kodewala.string1;

public class Driver1 {

	public static void main(String[] args) {
		String firstName = "Kodewala"; // Object created in SCP(String Constant Pool) -> firstName's address -> abc1237
		String lastName = "Kodewala";  // Object with content "Kodewala" already created
									   // and last name will refer to existing Object
									   // lastName is also pointing to same address -> abc1237
		//String middle = new String("Academy");
		
		
		System.out.println(firstName);
		System.out.println(lastName);
		//System.out.println(middle);
		
		System.out.println(firstName == lastName); // == will compare the address of an object
		
		//System.out.println(firstName.equals(middle));
	}

}
