package src.state.java.com.my;

public class PublishedState extends State {
    public PublishedState(Message message) {
        super(message);
    }

    @Override
    public void publish() {
        System.out.println("already published");
    }
}
