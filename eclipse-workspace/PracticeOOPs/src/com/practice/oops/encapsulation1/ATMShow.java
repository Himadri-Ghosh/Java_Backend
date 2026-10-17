package com.practice.oops.encapsulation1;

public class ATMShow {

	public static void main(String[] args) 
	{
		ATM atm = new ATM(2835, 30000);
		
		double balance = atm.checkBalance(2835);
		atm.withdraw(2835, 2000);
		
		System.out.println(balance);
	}

}
