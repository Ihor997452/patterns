package src.composite.java.com.my;

import java.util.ArrayList;
import java.util.List;

public class Message implements Clickable {
    private final String title;
    public List<File> files = new ArrayList<>();

    public Message(String title) {
        this.title = title;
    }

    @Override
    public void click() {
        System.out.println(title + " Click");
        for (File file : files) {
            file.click();
        }
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }
}
