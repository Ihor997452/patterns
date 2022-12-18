package src.decorator.java.com.my;

public class EmailNotificationSenderDecorator extends NotificationSenderDecorator {
    public EmailNotificationSenderDecorator(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendNotification() {
        System.out.println("Gotta send email notification");
        super.sendNotification();
        System.out.println("email notification sent!");
    }
}
