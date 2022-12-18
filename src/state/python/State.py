from abc import ABC, abstractmethod


class State(ABC):
    message: 'Message' = None

    def __init__(self, message: 'Message'):
        self.message = message

    @abstractmethod
    def publish(self):
        pass


class DraftState(State):
    def publish(self):
        self.message.state = ModerationState(self.message)
        print("Message sent to moderation stuff")


class ModerationState(State):
    def publish(self):
        print("Checking Message")
        self.message.state = ModerationState(self.message)
        print("Message Published")


class PublishedState(State):
    def publish(self):
        print("Already Published")


class Message:
    content: str
    state: 'State'

    def __init__(self, content: str):
        self.state = DraftState(self)
        self.content = content

    def publish(self):
        self.state.publish()
