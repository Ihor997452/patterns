package src.decorator.java.com.my;

public abstract class NotificationSenderDecorator implements NotificationSender {
    private final NotificationSender sender;

    public NotificationSenderDecorator(NotificationSender sender) {
        this.sender = sender;
    }

    @Override
    public void sendNotification() {
        sender.sendNotification();
    }
}
