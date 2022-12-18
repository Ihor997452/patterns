package src.decorator.java.com.my;

public class SmsNotificationSenderDecorator extends NotificationSenderDecorator {
    public SmsNotificationSenderDecorator(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendNotification() {
        System.out.println("Gotta send SMS notification");
        super.sendNotification();
        System.out.println("SMS notification sent!");
    }
}
