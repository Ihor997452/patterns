package src.bridge.java.com.my.abstraction;

import src.bridge.java.com.my.implementation.MessageSender;

public abstract class Message {
    protected MessageSender sender;

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public void send() {
        sender.sendMessage();
    }
}
