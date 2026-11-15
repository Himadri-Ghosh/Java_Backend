package com.practice.oops.encapsulation4;

public class Payment 
{
	String name;
	String invoiceId;
	private double payableAmount;
	
	Payment(String _name, String _invoiceId, double _payableAmount)
	{
		this.name = _name;
		this.invoiceId = _invoiceId;
		this.payableAmount = _payableAmount;
	}
	
	public double getPayableAmount()
	{
		return payableAmount;
	}
	
	public void amountCredited(double amount)
	{
		if(amount > 0)
		{
			payableAmount += amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	public void amountDebited(double amount)
	{
		if(amount > 0 && amount <= payableAmount)
		{
			payableAmount -= amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
}
