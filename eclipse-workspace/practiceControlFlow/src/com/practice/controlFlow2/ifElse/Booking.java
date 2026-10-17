package com.practice.controlFlow2.ifElse;

public class Booking 
{
	public void doBooking(String from, String to, int noOfPassenger)
	{
		String pnr = null;
		
		if(noOfPassenger > 5)
			/**
			 * if true then only below codes are execute
			 */
		{
			System.out.println("Only 5 passengers are allowed");
		}
		else {
			pnr = "923147438998";
			System.out.println("Confirming the booking : " + pnr);
			System.out.println("Status : CONFIRMED");
			System.out.println("Seat : B1 23UB");
		}
	}
}
