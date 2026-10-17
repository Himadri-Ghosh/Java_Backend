package com.practice.objects.instanceBlock;

class AccountMgmt {
	AccountMgmt() {
		System.out.println("This.is from AccountMgmt.AccountMgmt()");
	}
}

public class Account1 extends AccountMgmt {
	String accountNumber;

	{
		System.out.println("This is from instance block");
	}

	Account1(String _accountNumber) {
		super();   //  1st call 
//		2nd call the instance Block --> this will get executed whenever object created
		this.accountNumber = _accountNumber;

		System.out.println("This is Account1.Account1(String _accountNumber) constructor");
	}

	Account1() {
		
	}
}
