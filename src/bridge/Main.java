package src.bridge;

import src.bridge.java.com.my.abstraction.Message;
import src.bridge.java.com.my.abstraction.TextMessage;
import src.bridge.java.com.my.abstraction.VoiceMessage;
import src.bridge.java.com.my.implementation.TextMessageSender;
import src.bridge.java.com.my.implementation.VoiceMessageSender;

public class Main {
    public static void main(String[] args) {
        Message message;

        message = new TextMessage(new TextMessageSender());
        message.send();

        message = new VoiceMessage(new VoiceMessageSender());
        message.send();
    }
}
