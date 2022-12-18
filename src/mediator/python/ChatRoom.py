from typing import List
from src.mediator.python.Message import Message


class User:
    name: str = None
    chatRoom: 'ChatRoom' or None = None

    def __init__(self, name: str):
        self.name = name

    def join_chat_room(self, chatRoom: 'ChatRoom'):
        self.chatRoom = chatRoom
        chatRoom.add_to_chat_room(self)

    def leave_chat_room(self):
        self.chatRoom.remove_from_chat_room(self)
        self.chatRoom = None

    def send_message(self, message: str):
        if self.chatRoom is not None:
            self.chatRoom.send_message(self, message)


class ChatRoom:
    users: List['User'] = []
    messages: List[Message] = []

    def send_message(self, user: 'User', message: str | Message):
        if type(message) == str:
            message = Message(message)

        self.messages.append(message)
        print(user.name.upper() + ": " + message.message.lower())

    def add_to_chat_room(self, user: 'User'):
        self.users.append(user)
        print(user.name.upper() + " joined Chat Room")

    def remove_from_chat_room(self, user: 'User'):
        self.users.remove(user)
        print(user.name.upper() + " left Chat Room")
