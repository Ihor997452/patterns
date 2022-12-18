package src.template;

import src.template.java.com.my.LandingPage;
import src.template.java.com.my.MessagesPage;
import src.template.java.com.my.WebPageTemplate;

public class Main {
    public static void main(String[] args) {
        WebPageTemplate template;

        template = new MessagesPage();
        template.show();
        System.out.println();

        template = new LandingPage();
        template.show();
        System.out.println();
    }
}
