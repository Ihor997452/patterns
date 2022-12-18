package src.chainOfResponsibility.java.com.my;

public class UserExistsCheckLink extends ChainLink {
    @Override
    public boolean check(String username, String password, String token) {
        if (username.equals("admin") && password.equals("admin")) {
            return next(username, password, token);
        } else if (username.equals("1") && password.equals("1")) {
            return next(username, password, token);
        }

        return false;
    }
}
