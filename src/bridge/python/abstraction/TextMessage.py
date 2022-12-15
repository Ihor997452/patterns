from src.bridge.python.abstraction.Message import Message
from src.bridge.python.implementation.TextMessageSender import TextMessageSender


class TextMessage(Message):
    def __init__(self, sender: TextMessageSender):
        super().__init__(sender)

    def send(self):
        self.sender.send()
