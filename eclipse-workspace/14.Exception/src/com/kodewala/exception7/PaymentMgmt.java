package com.kodewala.exception7;

public class PaymentMgmt 
{
	public void doPayment(String account, int amount) throws FundTransferException
	{
		// chack the balance
		try {
			checkBalance(account, amount);
		}
		catch (InsufficientBalanceException e) 
		{
			throw new FundTransferException("You do not have enogh balance OR "
					+ "in case you have opened the account recently "
					+ "please wait for 24hr brfore doing fund transfer");
		}
	}
	
	private boolean checkBalance(String account, int amount)
	{
		boolean checkBalanceStatus = false;
		int balance = 1000; // from databse
		if(amount > balance)
		{
//			balance is not enough
			throw new InsufficientBalanceException(account + "does not have enough balance "
					+ "and current balance is " + balance);
		}else {
			checkBalanceStatus = true;
		}
		
		return checkBalanceStatus;
	}
}
