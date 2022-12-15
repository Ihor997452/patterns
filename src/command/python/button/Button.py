from src.command.python.CommandManager import CommandManager


class Button:
    command: str = None

    def __init__(self, command: str):
        self.command = command

    def click(self):
        CommandManager.executeCommand(self.command)
