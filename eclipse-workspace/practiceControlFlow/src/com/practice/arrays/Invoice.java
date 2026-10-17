package com.practice.arrays;

public class Invoice {

	public static void main(String[] args) {
		Product1 product1 = new Product1("Asus", 89000, "OR2783");
		Product1 product2 = new Product1("Oppo", 35000, "OR1203");
		Product1 product3 = new Product1("Vivo", 42000, "OR0382");
		Product1 product4 = new Product1("Lenovo", 89000, "OR6383");

		Product1[] product = new Product1[4];
		product[0] = product1;
		product[1] = product2;
		product[2] = product3;
		product[3] = product4;

		for (int i = 0; i < product.length; i++) {
			System.out.println("Product Name : " + product[i].itemName + "; Product Price : " + product[i].price
					+ "; Order ID : " + product[i].orderId);
		}
	}

}
