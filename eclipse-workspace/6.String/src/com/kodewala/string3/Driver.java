package com.kodewala.string3;

public class Driver {

	public static void main(String[] args) {
		String s = "Kodewala"; // SCP
		// in case I want to change s
		
		String s2 = s.concat(" Academy"); //trying to change the object
										// Object created in heap with content Kodewala Academy 
		System.out.println(s2);
	}

}
