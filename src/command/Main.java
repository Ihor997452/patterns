package src.command;

import src.command.java.com.my.button.Button;

public class Main {
    public static void main(String[] args) {
        Button button;

        button = new Button("like post");
        button.click();

        button = new Button("send message");
        button.click();
    }
}
