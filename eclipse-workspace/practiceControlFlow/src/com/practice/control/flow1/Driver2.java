package com.practice.control.flow1;
import java.util.*;

public class Driver2 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = scanner.nextInt();
		
		
		MovieTicket ticketPrice = new MovieTicket();
		ticketPrice.ticketCharges(age);
		
		scanner.close();
	}
}
