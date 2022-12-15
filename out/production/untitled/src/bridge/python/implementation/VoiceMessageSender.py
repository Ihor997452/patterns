from src.bridge.python.implementation.MessageSender import MessageSender


class VoiceMessageSender(MessageSender):
    def send(self):
        print("sending voice message..")
