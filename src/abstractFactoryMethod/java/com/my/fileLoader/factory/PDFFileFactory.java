package src.abstractFactoryMethod.java.com.my.fileLoader.factory;

import src.abstractFactoryMethod.java.com.my.fileLoader.file.File;
import src.abstractFactoryMethod.java.com.my.fileLoader.file.PDFFile;

public class PDFFileFactory extends FIleFactory {
    @Override
    public File create() {
        return new PDFFile();
    }
}
