from src.factoryMethod.python.factory.ImageFactory import ImageFactory
from src.factoryMethod.python.factory.JPGImageFactory import JPGImageFactory
from src.factoryMethod.python.factory.PNGImageFactory import PNGImageFactory


def f(factory: ImageFactory) -> None:
    print(factory.create())


if __name__ == '__main__':
    f(JPGImageFactory())
    f(PNGImageFactory())
