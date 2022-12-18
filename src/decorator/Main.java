package src.decorator;

import src.decorator.java.com.my.EmailNotificationSenderDecorator;
import src.decorator.java.com.my.NotificationSender;
import src.decorator.java.com.my.NotificationSenderImpl;
import src.decorator.java.com.my.SmsNotificationSenderDecorator;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender;

        sender = new EmailNotificationSenderDecorator(new NotificationSenderImpl());
        sender.sendNotification();
        System.out.println();

        sender = new SmsNotificationSenderDecorator(new NotificationSenderImpl());
        sender.sendNotification();
        System.out.println();

        sender = new EmailNotificationSenderDecorator(new SmsNotificationSenderDecorator(new NotificationSenderImpl()));
        sender.sendNotification();
        System.out.println();
    }
}
