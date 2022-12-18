from src.decorator.python.EmailNotificationSenderDecorator import EmailNotificationSenderDecorator
from src.decorator.python.NotificationSenderImpl import NotificationSenderImpl
from src.decorator.python.SmsNotificationSenderDecorator import SmsNotificationSenderDecorator

if __name__ == '__main__':
    sender = EmailNotificationSenderDecorator(NotificationSenderImpl())
    sender.sendNotification()
    print()

    sender = SmsNotificationSenderDecorator(NotificationSenderImpl())
    sender.sendNotification()
    print()

    sender = EmailNotificationSenderDecorator(SmsNotificationSenderDecorator(NotificationSenderImpl()))
    sender.sendNotification()
    print()
