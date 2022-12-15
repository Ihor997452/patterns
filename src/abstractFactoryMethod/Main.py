from src.abstractFactoryMethod.python.fileLoader.AbstractFactory import AbstractFactory

if __name__ == '__main__':
    print(AbstractFactory.getPDFFileFactory().create())
    print(AbstractFactory.getDOCXFileFactory().create())
    print(AbstractFactory.getPNGImageFactory().create())
    print(AbstractFactory.getJPGImageFactory().create())

    print(AbstractFactory.getFactory("pdf").create())
    print(AbstractFactory.getFactory("docx").create())
    print(AbstractFactory.getFactory("png").create())
    print(AbstractFactory.getFactory("jpg").create())
