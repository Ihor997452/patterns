package src.chainOfResponsibility.java.com.my;

public class TokenCheckLink extends ChainLink {
    @Override
    public boolean check(String username, String password, String token) {
        if (token.equals("token")) {
            return next(username, password, token);
        }

        return false;
    }
}
