package com.kodewala.constructors2;

public class NotificationService {
	
	public void sendNotification(String _type) {
		
		System.out.println("NotificationService.sendNotification()");
		
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if(_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatsApp();
		}
		
	}
	
	private void sendSMS() {
		
		System.out.println("NotificationService.sendSMS() START");
			//Biz logic
		System.out.println("NotificationService.sendSMS() END");
		
	}
	private void sendEmail() {
		
		System.out.println("NotificationService.sendEmail() START");
		//Biz logic
		System.out.println("NotificationService.sendEmail() END");
		
	}
	private void sendWhatsApp() {
		
		System.out.println("NotificationService.sendWhatsApp() START");
		//Biz logic
		System.out.println("NotificationService.sendWhatsApp() END");
		
	}

}
