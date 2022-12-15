package src.factoryMethod.java.com.my.factory;

import src.factoryMethod.java.com.my.image.Image;
import src.factoryMethod.java.com.my.image.PNGImage;

public class PNGImageFactory extends ImageFactory {
    @Override
    public Image create() {
        return new PNGImage();
    }
}
