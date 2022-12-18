package src.template.java.com.my;

public class LandingPage extends WebPageTemplate {
    @Override
    public void header() {
        System.out.println("Landing header");
    }

    @Override
    public void content() {
        System.out.println("Landing content");
    }

    @Override
    public void footer() {
        System.out.println("Landing footer");
    }
}
