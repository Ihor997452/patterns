package src.bridge.java.com.my.implementation;

public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("sending text message..");
    }
}
