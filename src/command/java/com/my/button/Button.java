package src.command.java.com.my.button;

import src.command.java.com.my.CommandManager;

public class Button {
    protected String command;

    public Button(String command) {
        this.command = command;
    }

    public void click() {
        CommandManager.executeCommand(command);
    }
}
