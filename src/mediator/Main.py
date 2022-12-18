from src.mediator.python.ChatRoom import ChatRoom
from src.mediator.python.ChatRoom import User

if __name__ == '__main__':
    chatRoom = ChatRoom()

    a = User("a")
    b = User("b")
    c = User("c")

    a.join_chat_room(chatRoom)
    a.send_message("Anyone Here?")
    b.join_chat_room(chatRoom)
    b.send_message("Hey")
    a.leave_chat_room()
    c.join_chat_room(chatRoom)
    c.send_message("Hello everyone")
