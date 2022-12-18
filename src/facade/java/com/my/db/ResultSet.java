package src.facade.java.com.my.db;

public class ResultSet {
    private final String result;

    public ResultSet(String result) {
        this.result = result.toLowerCase();
    }

    public String getResult() {
        return result;
    }
}
