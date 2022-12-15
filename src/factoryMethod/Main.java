package src.factoryMethod;

import src.factoryMethod.java.com.my.factory.ImageFactory;
import src.factoryMethod.java.com.my.factory.JPGImageFactory;
import src.factoryMethod.java.com.my.factory.PNGImageFactory;

public class Main {
    public static void main(String[] args) {
        ImageFactory imageFactory;
        imageFactory = new JPGImageFactory();
        System.out.println(imageFactory.create());
        imageFactory = new PNGImageFactory();
        System.out.println(imageFactory.create());
    }
}
