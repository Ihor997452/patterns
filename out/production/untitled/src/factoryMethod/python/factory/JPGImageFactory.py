from src.factoryMethod.python.factory.ImageFactory import ImageFactory
from src.factoryMethod.python.image.JPGImage import JPGImage


class JPGImageFactory(ImageFactory):
    def create(self):
        return JPGImage()
