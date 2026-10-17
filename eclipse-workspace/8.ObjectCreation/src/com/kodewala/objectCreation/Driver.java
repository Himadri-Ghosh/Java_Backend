package com.kodewala.objectCreation;

public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Driver.main() START");
		
//		User u1 = new User("Kodewala", "ID2739", "340387640");
//		User u2 = new User("Kodewala Academy", "ID9373", "645849393");
//		User u3 = new User("Physicswala", "ID3538", "92383749");
		
		Account acc1 = new Account("20983293749");
		Account acc2 = new Account("89373723920");
		
		System.out.println("Driver.main() END");
	}

}
