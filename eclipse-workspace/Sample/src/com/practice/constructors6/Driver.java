package com.practice.constructors6;

public class Driver 
{
	public static void main(String args[])
	{
		ElectronicProduct eProduct = new ElectronicProduct("Asus", 79000, "ID9363", 2);
		
		System.out.println("Product Name : " + eProduct.name);
		System.out.println("Product Price : " + eProduct.price);
		System.out.println("Product ID : " + eProduct.productId);
		System.out.println("Product Warenty : " + eProduct.warranty);
	}
}
