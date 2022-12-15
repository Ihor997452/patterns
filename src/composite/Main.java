package src.composite;

import src.composite.java.com.my.File;
import src.composite.java.com.my.Message;

public class Main {
    public static void main(String[] args) {
        Message message1 = new Message("message1");
        Message message2 = new Message("message2");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");

        message1.addFile(file1);
        message2.addFile(file2);
        message2.addFile(file4);
        message2.addFile(file3);

        message1.click();
        message2.click();
    }
}
