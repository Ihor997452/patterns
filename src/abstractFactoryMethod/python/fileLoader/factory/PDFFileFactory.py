from src.abstractFactoryMethod.python.fileLoader.factory.FileFactory import FileFactory
from src.abstractFactoryMethod.python.fileLoader.file.PDFFile import PDFFile


class PDFFileFactory(FileFactory):
    def create(self):
        return PDFFile()
