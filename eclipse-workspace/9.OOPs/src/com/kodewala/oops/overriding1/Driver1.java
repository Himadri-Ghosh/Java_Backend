package com.kodewala.oops.overriding1;


class Account 
{
	public void openAccount()
	{
//		Some 100 lines of code...........
		System.out.println("Account.openAccount()..........");
	}
	
}

class SavingAccount extends Account
{
//	Method name should be same
//	Type, Order and Number should be same
//	Return type should be same except covariant
//	Access Modifier --> should be sane or widen ( public --> public, protected --> protected or public)
	
	@Override   // You are telling compiler that I'm overriding the method
	public void openAccount()
	{
//		Some 200 lines of codes added...........
		System.out.println("SavingAccount.openAccount().........");
	}
}


public class Driver1 {

	public static void main(String[] args) 
	{
		SavingAccount sAccount = new SavingAccount();
		
	}

}
