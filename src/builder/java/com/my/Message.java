package src.builder.java.com.my;

import src.abstractFactoryMethod.java.com.my.fileLoader.file.File;
import src.factoryMethod.java.com.my.image.Image;
import src.prototype.java.com.my.db.model.User;

public class Message {
    private String content;
    private Image image;
    private File file;
    private User from;
    private User to;

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", image=" + image +
                ", file=" + file +
                ", from=" + from +
                ", to=" + to +
                '}';
    }

    public String getContent() {
        return content;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }

    public Image getImage() {
        return image;
    }

    public Message setImage(Image image) {
        this.image = image;
        return this;
    }

    public File getFile() {
        return file;
    }

    public Message setFile(File file) {
        this.file = file;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public Message setFrom(User from) {
        this.from = from;
        return this;
    }

    public User getTo() {
        return to;
    }

    public Message setTo(User to) {
        this.to = to;
        return this;
    }

    public Message build() {
        return this;
    }
}
