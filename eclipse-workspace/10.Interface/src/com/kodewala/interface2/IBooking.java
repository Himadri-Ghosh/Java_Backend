package com.kodewala.interface2;

public interface IBooking 
{
//	 what to do?
	public abstract void book();
	public abstract void cancelBooking();
	public abstract void checkStatus();
	
	public default void autoUpgrade()
	{
		System.out.println("IBooking.autoUpgrade().......");			
	}
	
}
