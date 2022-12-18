package src.chainOfResponsibility;

import src.chainOfResponsibility.java.com.my.ChainLink;
import src.chainOfResponsibility.java.com.my.RoleCheckLink;
import src.chainOfResponsibility.java.com.my.TokenCheckLink;
import src.chainOfResponsibility.java.com.my.UserExistsCheckLink;

public class Main {
    public static void main(String[] args) {
        System.out.println(ChainLink.initialize(
                new UserExistsCheckLink(),
                new TokenCheckLink(),
                new RoleCheckLink()
        ).check("admin", "admin", "token"));

        System.out.println(ChainLink.initialize(
                new UserExistsCheckLink(),
                new TokenCheckLink(),
                new RoleCheckLink()
        ).check("1", "1", "token"));

        System.out.println(ChainLink.initialize(
                new UserExistsCheckLink(),
                new TokenCheckLink(),
                new RoleCheckLink()
        ).check("admin", "admin", "1"));
    }
}
