package com.practice.oops.singleInheritance;

public class ElectronicProduct extends Product
{
	String brand;
	int warrantyYear;
	
	public ElectronicProduct(String _productName, int _price, String _brand, int _warrantyYear) 
	{
		super(_productName, _price);
		this.brand = _brand;
		this.warrantyYear = _warrantyYear;
	}
	
	void displayElectronicProduct()
	{
		displayProductDetails();
		System.out.println("Brand : " + brand);
		System.out.println("Warranty Month : " + warrantyYear);
	}
}
