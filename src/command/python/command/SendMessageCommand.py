from src.command.python.command.Command import Command


class SendMessageCommand(Command):
    def execute(self):
        print("sending message")
