package com.practice.interface2;

public interface IBooking 
{
	public abstract void book();
	public abstract void cancelBooking();
	void checkStatus();
	
	public default void autoUpgrade() 
	{
		
	}
}
