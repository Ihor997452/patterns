package src.state.java.com.my;

public class Message {
    private State state;
    private String content;

    public Message(String content) {
        this.state = new DraftState(this);
        this.content = content;
    }

    public void publish() {
        state.publish();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
