package src.bridge.java.com.my.abstraction;

import src.bridge.java.com.my.implementation.MessageSender;

public class TextMessage extends Message {
    public TextMessage(MessageSender sender) {
        super(sender);
    }
}
