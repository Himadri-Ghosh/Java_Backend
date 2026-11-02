package com.kodewala.interface4;

public class Driver {

	public static void main(String[] args) 
	{
		IAccount account = (name, add, amt) -> {
			System.out.println("Opening account..... for " + name);
			System.out.println("Address : " + add);
			System.out.println("Balance is " + amt);
			
			return "Account Opened";
		};
		
		String res = account.openAccount("Kodewala", "BTM Bangalore", 2000);
		System.out.println(res);
	}

}
