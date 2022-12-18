package src.chainOfResponsibility.java.com.my;

public abstract class ChainLink {
    private ChainLink nextLink;

    public static ChainLink initialize(ChainLink head, ChainLink... chain) {
        ChainLink current = head;
        for (ChainLink next : chain) {
            current.nextLink = next;
            current = next;
        }

        return head;
    }

    public abstract boolean check(String username, String password, String token);

    protected boolean next(String username, String password, String token) {
        if (nextLink != null) {
            return nextLink.check(username, password, token);
        }

        return true;
    }
}
