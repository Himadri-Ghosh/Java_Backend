package com.kodewala.oops.solidPrincipal;

public class Driver {

	public static void main(String[] args) 
	{
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		
//		Ecart ecart = new Ecart();
		
		ShipRocket shipRocket = new ShipRocket();
		
		deliveryProcessor.processDelivery(shipRocket);
		
	}

}
