package src.command.java.com.my.command;

public class LikePostCommand implements Command {

    @Override
    public void execute() {
        System.out.println("liking post..");
    }
}
