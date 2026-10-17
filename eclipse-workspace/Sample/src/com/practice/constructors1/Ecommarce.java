package com.practice.constructors1;

public class Ecommarce {
	
	public static void main(String args[]) {
		
		System.out.println("----------Product1-----------");
		Product product1 = new Product("Books", 500, "mnsdkfgsddlaj", 4);
	
		System.out.println("Product Name : " + product1.productName);
		System.out.println("Price : " + product1.price);
		System.out.println("Description : " + product1.description);
		System.out.println("Quantity : " + product1.quantity);
		
		System.out.println("----------Product2-----------");
		Product product2 = new Product("Bat", "askkromamfjirc");
		
		System.out.println("Product Name : " + product2.productName);
		System.out.println("Description : " + product2.description);
		
		System.out.println("----------Product3-----------");
		Product product3 = new Product();
		
	}

}
