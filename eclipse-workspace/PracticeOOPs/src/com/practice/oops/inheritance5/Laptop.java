package com.practice.oops.inheritance5;

public class Laptop extends Device
{
	String batteryCapacity;
	
	Laptop(String brand, double price, String batteryCapacity)
	{
		super(brand, price);
		this.batteryCapacity = batteryCapacity;
	}
	
	void showBattery()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Laptop.showBattery()........" + batteryCapacity);
	}
}
