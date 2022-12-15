from src.bridge.python.abstraction.Message import Message
from src.bridge.python.implementation.VoiceMessageSender import VoiceMessageSender


class VoiceMessage(Message):
    def __init__(self, sender: VoiceMessageSender):
        super().__init__(sender)

    def send(self):
        self.sender.send()
