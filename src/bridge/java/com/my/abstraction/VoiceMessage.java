package src.bridge.java.com.my.abstraction;

import src.bridge.java.com.my.implementation.MessageSender;

public class VoiceMessage extends Message {
    public VoiceMessage(MessageSender sender) {
        super(sender);
    }
}
