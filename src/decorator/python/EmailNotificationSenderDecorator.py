from src.decorator.python.NotificationSenderDecorator import NotificationSenderDecorator


class EmailNotificationSenderDecorator(NotificationSenderDecorator):
    def sendNotification(self):
        print("Gotta send email notification")
        self.sender.sendNotification()
        print("Email notification sent!")
