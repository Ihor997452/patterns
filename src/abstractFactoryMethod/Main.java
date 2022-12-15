package src.abstractFactoryMethod;

import src.abstractFactoryMethod.java.com.my.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(AbstractFactory.getPNGImageFactory().create());
        System.out.println(AbstractFactory.getJPGImageFactory().create());
        System.out.println(AbstractFactory.getDOCXFileFactory().create());
        System.out.println(AbstractFactory.getPDFFileFactory().create());

        System.out.println(AbstractFactory.getFactory("png").create());
        System.out.println(AbstractFactory.getFactory("jpg").create());
        System.out.println(AbstractFactory.getFactory("pdf").create());
        System.out.println(AbstractFactory.getFactory("docx").create());
    }
}
