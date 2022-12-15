from src.bridge.python.implementation.MessageSender import MessageSender


class TextMessageSender(MessageSender):
    def send(self):
        print("sending text message..")
