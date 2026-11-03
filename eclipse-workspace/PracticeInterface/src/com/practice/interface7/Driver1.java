package com.practice.interface7;

public class Driver1 {

	public static void main(String[] args) 
	{
		IAccount1 account = () ->
		{
			System.out.println("Opening account........");
		};
		
		account.openAccount();
	}

}
