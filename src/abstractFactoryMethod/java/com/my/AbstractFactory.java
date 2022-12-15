package src.abstractFactoryMethod.java.com.my;

import src.abstractFactoryMethod.java.com.my.fileLoader.factory.DOCXFileFactory;
import src.abstractFactoryMethod.java.com.my.fileLoader.factory.PDFFileFactory;
import src.abstractFactoryMethod.java.com.my.fileLoader.file.File;
import src.factoryMethod.java.com.my.factory.Factory;
import src.factoryMethod.java.com.my.factory.JPGImageFactory;
import src.factoryMethod.java.com.my.factory.PNGImageFactory;
import src.factoryMethod.java.com.my.image.Image;

public class AbstractFactory {
    public static Factory getFactory(String name) {
        switch (name.toLowerCase()) {
            case "pdf" -> {
                return getPDFFileFactory();
            }
            case "docx" -> {
                return getDOCXFileFactory();
            }
            case "jpg" -> {
                return getJPGImageFactory();
            }
            case "png" -> {
                return getPNGImageFactory();
            }
            default -> {
                return () -> "Factory";
            }
        }
    }

    public static Factory<File> getPDFFileFactory() {
        return new PDFFileFactory();
    }

    public static Factory<File> getDOCXFileFactory() {
        return new DOCXFileFactory();
    }

    public static Factory<Image> getJPGImageFactory() {
        return new JPGImageFactory();
    }

    public static Factory<Image> getPNGImageFactory() {
        return new PNGImageFactory();
    }
}
