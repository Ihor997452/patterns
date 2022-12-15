from abc import ABC, abstractmethod

from src.bridge.python.implementation.MessageSender import MessageSender


class Message(ABC):
    sender: MessageSender = None

    def __init__(self, sender: MessageSender):
        self.sender = sender

    @abstractmethod
    def send(self): pass
