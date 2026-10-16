package com.amazon.sample1;

public class NotificationService {

	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification()");
		if (_type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatsapp();
		}

	}

	private void sendSMS() {
		System.out.println("NotificationService.sendSMS()");
	}

	private void sendEmail() {
		System.out.println("NotificationService.sendEmail()");
	}

	private void sendWhatsapp() {
		System.out.println("NotificationService.sendWhatsapp()");
	}
}
