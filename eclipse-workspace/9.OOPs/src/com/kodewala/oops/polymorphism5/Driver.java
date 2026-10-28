package com.kodewala.oops.polymorphism5;

class Delivery
{
	public void doDelivery()
	{
		System.out.println("Delivery.doDelivary().........Delivery");
	}
}

class Ecart extends Delivery
{
	@Override
	public void doDelivery()
	{
		System.out.println("Ecart.doDelivary().........Ecart");
	}
}

class XpressBee extends Delivery
{
	@Override
	public void doDelivery()
	{
		System.out.println("XpressBee.doDelivary().........XpressBee");
	}
}

public class Driver 
{
	public static void main(String[] args) 
	{
//		Delivery delivery = new Delivery();
//		Compile Time --> It will check the method of delivery class
//		Runtime --> It will call the method of Delivery class
//		delivery.doDelivery();
		
//		Parent class can refer the child class object
		Delivery delivery1 = new XpressBee();
//		Compile time --> It will check the method in delivery class
//		Runtime --> It will call the method of XpressBee class
//		delivery1.doDelivery();
		
		XpressBee xpressBee = (XpressBee) delivery1;
		xpressBee.doDelivery();
		
	}

}
