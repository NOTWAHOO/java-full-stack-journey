

public class NotificationServiceDriver {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("sms");
		notificationService.sendNotification("Email");
		notificationService.sendNotification("other");
	}

}
