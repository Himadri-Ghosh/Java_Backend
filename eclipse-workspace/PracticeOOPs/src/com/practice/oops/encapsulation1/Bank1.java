package com.practice.oops.encapsulation1;

public class Bank1 {

	public static void main(String[] args) 
	{
		Account1  acc1 = new Account1("Abhi", "6789387829039", 40000);
		
		acc1.doCredit(600);
		acc1.doDebit(200);
		
		double balance = acc1.getBalance();
		System.out.println(balance);
	}

}
