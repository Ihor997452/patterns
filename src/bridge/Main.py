from src.bridge.python.abstraction.TextMessage import TextMessage
from src.bridge.python.abstraction.VoiceMessage import VoiceMessage
from src.bridge.python.implementation.TextMessageSender import TextMessageSender
from src.bridge.python.implementation.VoiceMessageSender import VoiceMessageSender

if __name__ == '__main__':
    message = TextMessage(TextMessageSender())
    message.send()

    message = VoiceMessage(VoiceMessageSender())
    message.send()
