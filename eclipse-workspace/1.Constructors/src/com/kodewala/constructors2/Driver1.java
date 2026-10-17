package com.kodewala.constructors2;

public class Driver1 {
	
	public static void main(String args[]) {
		
		NotificationService notification = new NotificationService();
		
		notification.sendNotification("sms");
		notification.sendNotification("email");
		notification.sendNotification("others");
		
	}

}
