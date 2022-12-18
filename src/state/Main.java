package src.state;

import src.state.java.com.my.Message;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("hey");
        System.out.println(message.getState());
        message.publish();
        System.out.println(message.getState());
        message.publish();
        System.out.println(message.getState());
        message.publish();
    }
}
