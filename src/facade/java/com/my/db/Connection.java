package src.facade.java.com.my.db;

public class Connection {
    private ResultSet resultSet;

    public void connect(String db) {
        System.out.println("Connected to " + db);
    }

    public void executeStatement(Statement statement) {
        System.out.println("Executing statement " + statement.getStatement());
        resultSet = new ResultSet(statement.getStatement() + " result");
    }

    public ResultSet getResultSet() {
        return resultSet;
    }
}
