package src.template.java.com.my;

import src.chainOfResponsibility.java.com.my.ChainLink;
import src.chainOfResponsibility.java.com.my.RoleCheckLink;
import src.chainOfResponsibility.java.com.my.TokenCheckLink;
import src.chainOfResponsibility.java.com.my.UserExistsCheckLink;

public abstract class WebPageTemplate {
    public void show() {
        check();
        header();
        content();
        footer();
    }

    public void check() {
        if (ChainLink.initialize(
                new UserExistsCheckLink(),
                new TokenCheckLink(),
                new RoleCheckLink()
        ).check("1", "1", "token")) {
            System.out.println("logged in");
        } else {
            System.out.println("not logged in");
        }
    }

    public abstract void header();
    public abstract void content();
    public abstract void footer();
}
