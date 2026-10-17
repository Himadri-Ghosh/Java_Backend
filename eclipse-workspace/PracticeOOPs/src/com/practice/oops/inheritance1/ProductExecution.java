package com.practice.oops.inheritance1;

public class ProductExecution {

	public static void main(String[] args) 
	{
//		Product product = new Product("Laptop", "This is Laptop", 2, "Available");
//		
//		product.viewProductDetails();
		
		ElectronicProduct eProduct = new ElectronicProduct("Laptop", "This is laptop", 5, "available", true, 2);
		eProduct.viewElectronicProduct();
	}

}
