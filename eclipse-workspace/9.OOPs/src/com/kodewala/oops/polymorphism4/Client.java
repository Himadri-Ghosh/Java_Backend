package com.kodewala.oops.polymorphism4;

public class Client 
{
	public static void main(String args[])
	{
		SubscriptionProcessor subscriptionProcessor = new SubscriptionProcessor();
		
//		SilverSubscription silver = new SilverSubscription();
//		subscriptionProcessor.processSubscription(silver);
		
		GoldSubscription gold = new GoldSubscription();
		subscriptionProcessor.processSubscription(gold);
	}
}
