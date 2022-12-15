from src.command.python.command.LikePostCommand import LikePostCommand
from src.command.python.command.SendMessageCommand import SendMessageCommand


class CommandManager:
    @classmethod
    def executeCommand(cls, command: str):
        match command:
            case "like post": LikePostCommand().execute()
            case "send message": SendMessageCommand().execute()
