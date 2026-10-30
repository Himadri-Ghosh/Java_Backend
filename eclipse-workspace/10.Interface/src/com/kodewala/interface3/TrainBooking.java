package com.kodewala.interface3;

public class TrainBooking implements IBooking
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
	
	@Override
	public void autoUpgrade() 
	{
		System.out.println("TrainBooking.autoUpgrade().......");				
	}
	
	void printFlightTicket(String path, String content)
	{
		IBooking.printTicket("", "");
	}
}
