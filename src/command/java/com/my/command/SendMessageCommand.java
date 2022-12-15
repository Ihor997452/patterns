package src.command.java.com.my.command;

public class SendMessageCommand implements Command {
    @Override
    public void execute() {
        System.out.println("sending message..");
    }
}
