from src.abstractFactoryMethod.python.fileLoader.factory.FileFactory import FileFactory
from src.abstractFactoryMethod.python.fileLoader.file.DOCXFile import DOCXFile



class DOCXFileFactory(FileFactory):
    def create(self):
        return DOCXFile()
