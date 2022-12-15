from abc import ABC, abstractmethod


class MessageSender(ABC):
    @abstractmethod
    def send(self): pass
