package src.mediator.java.com.my;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    List<User> users = new ArrayList<>();
    List<Message> messages = new ArrayList<>();

    public void sendMessage(User user, String message) {
        sendMessage(user, new Message(message));
    }

    public void sendMessage(User user, Message message) {
        messages.add(message);
        System.out.println(user.getName().toUpperCase() + ": " + message.getMessage().toLowerCase());
    }

    public void addToChatRoom(User user) {
        users.add(user);
        System.out.println(user.getName().toUpperCase() + " joined Chat Room");
    }

    public void removeFromChatRoom(User user) {
        users.remove(user);
        System.out.println(user.getName().toUpperCase() + " left Chat Room");
    }
}
