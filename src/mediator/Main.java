package src.mediator;

import src.mediator.java.com.my.ChatRoom;
import src.mediator.java.com.my.Message;
import src.mediator.java.com.my.User;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User a = new User("a");
        User b = new User("b");
        User c = new User("c");

        a.joinChatRoom(chatRoom);
        a.sendMessage("Anyone Here?");
        b.joinChatRoom(chatRoom);
        b.sendMessage("Hey");
        a.leaveChatRoom();
        c.joinChatRoom(chatRoom);
        c.sendMessage("Hello everyone");
    }
}
