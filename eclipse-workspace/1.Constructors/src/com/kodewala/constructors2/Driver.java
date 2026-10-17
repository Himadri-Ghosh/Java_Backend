package com.kodewala.constructors2;
	
	class Invoice extends Object{
		
		static int gst = 18;
		
		int amount;
		String itemName;
		String billingAddress;
		String customerId;
		String customerName;
		
		Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName){
			
			this.amount = _amount;
			this.itemName = _itemName;
			this.billingAddress = _billingAddress;
			this.customerId = _customerId;
			this.customerName = _customerName;
		}
		
	}
	
public class Driver {
	
	public static void main(String args[]) {
		
		Invoice inv = new Invoice(180000, "iPhone18", "Kodewala, BTM 1st Stage, Bangalore", "C02735", "Kodewala");
		Invoice inv2 = new Invoice(24000, "Oppo", "Kodewala, BTM 2st Stage, Bangalore", "C19474", "Rohit");
		
		System.out.println("1st Invoice :" + inv.amount + " , " + inv.itemName + " , " + inv.customerId + " , " + inv.gst);
		System.out.println("1st Invoice :" + inv2.amount + " , " + inv2.itemName + " , " + inv2.customerId + " , " + inv2.gst);
		
	}

}
