package com.practice.oops.inheritance5;

public class Device 
{
	String brand;
	double price;
	
	Device(String brand, double price)
	{
		this.brand = brand;
		this.price = price;
	}
	
	void powerOn()
	{
		System.out.println("Device.powerOn().......");
	}
}
