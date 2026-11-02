package com.practice.interface6;

public class Driver {

	public static void main(String[] args) 
	{
		IShopping shopping = new Flipcart();
		shopping.purchase();
		
		shopping.returnItem();
	}

}
