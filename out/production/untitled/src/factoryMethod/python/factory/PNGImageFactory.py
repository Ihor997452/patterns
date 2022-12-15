from src.factoryMethod.python.factory.ImageFactory import ImageFactory
from src.factoryMethod.python.image.PNGImage import PNGImage


class PNGImageFactory(ImageFactory):
    def create(self):
        return PNGImage()
