package com.kodewala.constructors6;

public class Driver 
{
	public static void main(String args[]){
		{
			ElectronicProduct eproduct = new ElectronicProduct("Laptop", 80000, "ID722", 3);
			System.out.println("Name : " + eproduct.name);
			System.out.println("Price : " + eproduct.price);
			System.out.println("Product ID : " + eproduct.productId);
			System.out.println("Warranty : " + eproduct.warranty);
		}
	}
}
