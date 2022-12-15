package src.abstractFactoryMethod.java.com.my.fileLoader.factory;

import src.abstractFactoryMethod.java.com.my.fileLoader.file.DOCXFile;
import src.abstractFactoryMethod.java.com.my.fileLoader.file.File;

public class DOCXFileFactory extends FIleFactory {
    @Override
    public File create() {
        return new DOCXFile();
    }
}
