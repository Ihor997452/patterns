from src.composite.python.Clickable import Clickable


class File(Clickable):
    name: str = None

    def __init__(self, name):
        self.name = name

    def click(self):
        print(self.name + " click")
