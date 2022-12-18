package src.decorator.java.com.my;

public class NotificationSenderImpl implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification..");
    }
}
