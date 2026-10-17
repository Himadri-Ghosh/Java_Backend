package com.kodewala.arrays1;

public class Driver1 
{
	public static void main(String args[])
	{
		Product product1 = new Product("iPhone", 85000, "ID2936");
		Product product2 = new Product("Asus", 78000, "ID0873");
		Product product3 = new Product("Macbook", 215000, "ID2936");
		Product product4 = new Product("Dell", 55000, "ID3487");

		Product[] product = new Product[4];
		product[0] = product1;
		product[1] = product2;
		product[2] = product3;
		product[3] = product4;
		
	}
}
