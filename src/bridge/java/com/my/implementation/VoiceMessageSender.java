package src.bridge.java.com.my.implementation;

public class VoiceMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("sending voice message...");
    }
}
