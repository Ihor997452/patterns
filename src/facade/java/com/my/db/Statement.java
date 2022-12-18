package src.facade.java.com.my.db;

public class Statement {
    private final String statement;

    public Statement(String statement) {
        this.statement = statement.toLowerCase();
    }

    public String getStatement() {
        return this.statement;
    }
}
