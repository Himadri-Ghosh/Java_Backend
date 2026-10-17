package com.kodewala.constructors1;

public class Ecommerce {
	
	public static void main(String args[]) {
		
		Product product = new Product("Books", 200, "weiehqwjd wewiuhweuf", 3);
		
		System.out.println("--------Product1-------");
		
		System.out.println("Product Name : " + product.productName);
		System.out.println("Price : " + product.price);
		System.out.println("Description : " + product.description);
		System.out.println("Quantity : " + product.quantity);
		
		System.out.println("--------Product2-------");
		
		Product product2 = new Product("bat", "jkendewfcsml");
		
		System.out.println("Product Name : " + product2.productName);
		System.out.println("Description : " + product2.description);
		
		System.out.println("--------Product3-------");
		
		Product product3 = new Product();
		
		System.out.println("Product Name : " + product3.productName);
		System.out.println("Price : " + product3.price);
		System.out.println("Description : " + product3.description);
		System.out.println("Quantity : " + product3.quantity);
		
		}
	
		
}
