package com.practice.oops.singleInheritance;

public class Product 
{
	String productName;
	int price;
	
	Product(String _productName, int _price)
	{
		this.productName = _productName;
		this.price = _price;
	}
	
	void displayProductDetails()
	{
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
	}
}
