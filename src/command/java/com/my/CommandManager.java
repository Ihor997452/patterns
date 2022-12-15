package src.command.java.com.my;

import src.command.java.com.my.command.LikePostCommand;
import src.command.java.com.my.command.SendMessageCommand;

public class CommandManager {
    public static void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "like post" -> new LikePostCommand().execute();
            case "send message" -> new SendMessageCommand().execute();
        }
    }
}
