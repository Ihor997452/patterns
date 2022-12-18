package src.template.java.com.my;

public class MessagesPage extends WebPageTemplate {
    @Override
    public void header() {
        System.out.println("Messages page header");
    }

    @Override
    public void content() {
        System.out.println("Messages page content");
    }

    @Override
    public void footer() {
        System.out.println("Messages page footer");
    }
}
