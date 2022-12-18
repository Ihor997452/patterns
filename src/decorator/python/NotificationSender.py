from abc import ABC, abstractmethod


class NotificationSender(ABC):
    @abstractmethod
    def sendNotification(self):
        pass
