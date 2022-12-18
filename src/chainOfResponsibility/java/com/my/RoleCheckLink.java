package src.chainOfResponsibility.java.com.my;

public class RoleCheckLink extends ChainLink {
    @Override
    public boolean check(String username, String password, String token) {
        if (username.equals("admin")) {
            System.out.println("admin");
            return true;
        }

        System.out.println("user");
        return next(username, password, token);
    }
}
