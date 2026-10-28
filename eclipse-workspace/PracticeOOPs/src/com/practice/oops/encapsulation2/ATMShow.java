package com.practice.oops.encapsulation2;

public class ATMShow {

	public static void main(String[] args) 
	{
		ATM atm = new ATM("3638", 7500);
		
		atm.withdraw("3638", 300);
		
		double balance = atm.checkBalance("3638");
		System.out.println("Balance : " + balance);
	}

}
