package com.kodewala.oops.inheritance2;

public class Driver {

	public static void main(String[] args) 
	{
//		ElectronicProduct eProduct = new ElectronicProduct("Mobile", "This is mobile", 10, "available", true, 2);
//		eProduct.viewElectronicProduct();
		
		ClothingProduct cloth = new ClothingProduct("Shirt", "This is shirt", 3, "avlilable", "male", "Good");
		cloth.viewClothingDetails();
		
	}

}
