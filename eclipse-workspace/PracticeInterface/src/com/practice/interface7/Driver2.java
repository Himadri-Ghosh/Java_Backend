package com.practice.interface7;

public class Driver2 {

	public static void main(String[] args) 
	{
		IAccount2 account2 = (name, add, amt) ->
		{
			System.out.println("Opening account.... for " + name);
			System.out.println("Address : " + add);
			System.out.println("Balance : " + amt);
			return "Account Opened!!!";
		};
		
		String result = account2.openAccount("Rohit", "Kolkata", 2500);
		System.out.println(result);
	}

}
