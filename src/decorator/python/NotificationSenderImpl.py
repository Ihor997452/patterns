from src.decorator.python.NotificationSender import NotificationSender


class NotificationSenderImpl(NotificationSender):
    def sendNotification(self):
        print("Sending notification..")
