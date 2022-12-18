from src.state.python.State import Message

if __name__ == '__main__':
    message = Message("hey")
    print(message.state)
    message.publish()
    print(message.state)
    message.publish()
    print(message.state)
    message.publish()
