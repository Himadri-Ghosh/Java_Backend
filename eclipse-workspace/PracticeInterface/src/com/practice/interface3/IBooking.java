package com.practice.interface3;

public interface IBooking 
{
	void book();
	void cancelBooking();
	
	public default void autoUpgrade(){
		{
			System.out.println("IBooking.autoUpgrade()");
		}
	}
}
