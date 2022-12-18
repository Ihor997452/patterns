from abc import abstractmethod

from src.decorator.python.NotificationSender import NotificationSender


class NotificationSenderDecorator(NotificationSender):
    sender: NotificationSender

    def __init__(self, sender: NotificationSender):
        self.sender = sender

    @abstractmethod
    def sendNotification(self):
        self.sender.sendNotification()
