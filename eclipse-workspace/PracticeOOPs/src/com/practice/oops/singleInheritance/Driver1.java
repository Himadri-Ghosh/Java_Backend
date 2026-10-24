package com.practice.oops.singleInheritance;

public class Driver1 {

	public static void main(String[] args) 
	{
//		Product product = new Product("Laptop", 95000);
//		product.displayProductDetails();
		
		ElectronicProduct eProduct = new ElectronicProduct("Laptop", 87000, "ASUS", 2);
		eProduct.displayElectronicProduct();
	}

}
