package com.kodewala.interface3;

public class FlightBooking implements IBooking
{

	@Override
	public void book() {
		System.out.println("FlightBooking.book()..........");
	}

	@Override
	public void cancelBooking() {
		System.out.println("FlightBooking.cancelBooking()..........");		
	}

	@Override
	public void checkStatus() {
		System.out.println("FlightBooking.checkStatus()..........");		
	}
	
	void printFlightTicket(String path, String content)
	{
		IBooking.printTicket("", "");
	}
	
}
