from src.decorator.python.NotificationSenderDecorator import NotificationSenderDecorator


class SmsNotificationSenderDecorator(NotificationSenderDecorator):
    def sendNotification(self):
        print("Gotta send SMS notification")
        self.sender.sendNotification()
        print("SMS notification sent!")
