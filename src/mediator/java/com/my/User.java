package src.mediator.java.com.my;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void joinChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
        chatRoom.addToChatRoom(this);
    }

    public void leaveChatRoom() {
        this.chatRoom.removeFromChatRoom(this);
        this.chatRoom = null;
    }

    public void sendMessage(String message) {
        if (chatRoom != null) {
            chatRoom.sendMessage(this, message);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
