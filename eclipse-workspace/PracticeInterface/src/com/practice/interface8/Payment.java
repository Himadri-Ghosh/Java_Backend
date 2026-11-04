package com.practice.interface8;

class UPIPayment implements VarifiedPayment
{
	
}

class CreditCardPayment
{
	
}

public class Payment {

	public static void main(String[] args) 
	{
		UPIPayment upi = new UPIPayment();
		
//		CreditCardPayment creditCard = new CreditCardPayment();
		
		if(upi instanceof VarifiedPayment)
		{
			System.out.println("Payment varified");
		}
		else
		{
			System.out.println("Payment not varified");
		}
	}

}
