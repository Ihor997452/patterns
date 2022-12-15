package src.factoryMethod.java.com.my.factory;

import src.factoryMethod.java.com.my.image.Image;
import src.factoryMethod.java.com.my.image.JPGImage;

public class JPGImageFactory extends ImageFactory {
    @Override
    public Image create() {
        return new JPGImage();
    }
}
