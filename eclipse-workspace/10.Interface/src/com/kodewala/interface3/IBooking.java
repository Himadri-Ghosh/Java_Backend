package com.kodewala.interface3;

public interface IBooking 
{
	public abstract void book();
	public abstract void cancelBooking();
	public abstract void checkStatus();
	
	public default void autoUpgrade()
	{
		// 200 lines of code(connection to DB, upgrading)
		connectDB();
		System.out.println("IBooking.autoUpgrade..........");
	}
	
	public default void sendNotification()
	{
		// 200 lines of code(connection to DB, sendNotification)
		connectDB();
		System.out.println("IBooking.sendNotification..........");
	}
	
	private void connectDB()
	{
		System.out.println("IBooking.connectDB......");
	}
	
	public static void printTicket(String path, String content)
	{
		// 200 lines of code
		System.out.println("Printing Ticket.....static method");
	}
}
