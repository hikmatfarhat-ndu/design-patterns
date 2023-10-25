public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
        Notification notification2 = notificationFactory.createNotification("Email");
        notification2.notifyUser();
    }
}
