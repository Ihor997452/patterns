package src.state.java.com.my;

public class DraftState extends State {

    public DraftState(Message message) {
        super(message);
    }

    @Override
    public void publish() {
        message.setState(new ModerationState(message));
        System.out.println("Message sent to moderation stuff");
    }
}
