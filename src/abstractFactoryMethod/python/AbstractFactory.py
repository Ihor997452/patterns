from src.abstractFactoryMethod.python.fileLoader.factory.DOCXFileFactory import DOCXFileFactory
from src.abstractFactoryMethod.python.fileLoader.factory.PDFFileFactory import PDFFileFactory
from src.factoryMethod.python.factory.JPGImageFactory import JPGImageFactory
from src.factoryMethod.python.factory.PNGImageFactory import PNGImageFactory


class AbstractFactory:
    @classmethod
    def getFactory(cls, name: str):
        match name:
            case "pdf": return PDFFileFactory()
            case "docx": return DOCXFileFactory()
            case "png": return PNGImageFactory()
            case "jpg": return JPGImageFactory()

    @classmethod
    def getPDFFileFactory(cls):
        return PDFFileFactory()

    @classmethod
    def getDOCXFileFactory(cls):
        return DOCXFileFactory()

    @classmethod
    def getPNGImageFactory(cls):
        return PNGImageFactory()

    @classmethod
    def getJPGImageFactory(cls):
        return JPGImageFactory()
