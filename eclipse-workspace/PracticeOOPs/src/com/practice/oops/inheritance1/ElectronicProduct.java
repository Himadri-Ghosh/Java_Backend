package com.practice.oops.inheritance1;

public class ElectronicProduct extends Product
{
	boolean isWarranty;
	int warrantyInYear;
	
	public ElectronicProduct( String productName, String description, int quantity, String status, boolean isWaranty, int warantyInYear) 
	{
		super(productName, description, quantity, status);
		this.isWarranty = isWaranty;
		this.warrantyInYear = warantyInYear;
	}
	
	public void viewElectronicProduct()
	{
		viewProductDetails();
		
		System.out.println(isWarranty);
		System.out.println(warrantyInYear);
	}
}
