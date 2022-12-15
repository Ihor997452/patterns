package src.composite.java.com.my;

public class File implements Clickable {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void click() {
        System.out.println(name + " click");
    }
}
