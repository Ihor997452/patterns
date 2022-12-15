from typing import List

from src.composite.python.Clickable import Clickable
from src.composite.python.File import File


class Message(Clickable):
    files: List[File] = []
    title: str = None

    def __init__(self, title: str):
        self.title = title

    def click(self):
        print(self.title + " click")

        for file in self.files:
            file.click()

    def addFile(self, file: File):
        self.files.append(file)

    def removeFile(self, file: File):
        self.files.remove(file)
