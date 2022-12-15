package src.builder;

import src.abstractFactoryMethod.java.com.my.AbstractFactory;
import src.abstractFactoryMethod.java.com.my.fileLoader.factory.FIleFactory;
import src.abstractFactoryMethod.java.com.my.fileLoader.file.File;
import src.builder.java.com.my.Message;
import src.factoryMethod.java.com.my.factory.Factory;
import src.factoryMethod.java.com.my.image.Image;
import src.prototype.java.com.my.db.model.User;

public class Main {
    public static void main(String[] args) {
        Factory<File> fIleFactory = AbstractFactory.getFactory("pdf");
        Factory<Image> imageFactory = AbstractFactory.getFactory("png");
        User from = new User(0, "username0", "password0", "email0");
        User to = new User(1, "username1", "password1", "email1");

        Message message = new Message()
                .setFrom(from)
                .setTo(to)
                .setContent("content")
                .setImage(imageFactory.create())
                .setFile(fIleFactory.create())
                .build();

        System.out.println(message);
    }
}
