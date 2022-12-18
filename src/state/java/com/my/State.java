package src.state.java.com.my;

public abstract class State {
    Message message;

    public State(Message message) {
        this.message = message;
    }

    public abstract void publish();
}
