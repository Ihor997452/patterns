package src.state.java.com.my;

public class ModerationState extends State {
    public ModerationState(Message message) {
        super(message);
    }

    @Override
    public void publish() {
        System.out.println("Checking message");
        message.setState(new PublishedState(message));
        System.out.println("Published");
    }
}
