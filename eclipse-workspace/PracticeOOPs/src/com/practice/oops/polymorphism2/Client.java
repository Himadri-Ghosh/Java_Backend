package com.practice.oops.polymorphism2;

public class Client {

	public static void main(String[] args) 
	{
		SubscriptionProcessor subscriptionProcessor = new SubscriptionProcessor();
		
//		GoldSubscription gold = new GoldSubscription();
		
//		RegularSubscription regular = new RegularSubscription();
		
		PlatinumSubscription platinum = new PlatinumSubscription();
		
		subscriptionProcessor.processSubscription(platinum);
		
	}

}
