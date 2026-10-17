package com.kodewala.string5;

public class Driver1 {
	
	class AccountMgmt // if use final, then this class cann't become Parent
	{
		 final int UPI_LIMIT = 100000;
		
		public final void doSomething1()
		{
//			UPI_LIMIT = 200000;
		}
		
		public void doSomething2()
		{
//			some function ..........
		}
	}
	
	class Account extends AccountMgmt
	{
//		@Override
		public void doSomething2()
		{
//			some function...........
		}
	}
	
	public static void main(String[] args) 
	{
		
		
	}

}
