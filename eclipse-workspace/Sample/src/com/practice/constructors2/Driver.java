package com.practice.constructors2;

class Invoice extends Object
{
	static int gst = 18;
	
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName)
	{
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
}

public class Driver {
	
	public static void main(String args[]) {
		
		Invoice inv = new Invoice(50000, "Oneplus", "Sector V, Kolkata", "C9943", "Rohit");
		Invoice inv1 = new Invoice(20000, "Oppo", "Newtown, Kolkata", "C2937", "Shyam");
		
		System.out.println("1st Invoice : " + inv.customerName + " , "+inv.amount+" , "+inv.billingAddress+" , "+inv.gst);
		System.out.println("2nd Invoice : " + inv1.customerName + " , "+inv1.amount+" , "+inv1.billingAddress+" , "+inv1.gst);
		
	}

}
