package src.facade.java.com.my;

import src.facade.java.com.my.db.Connection;
import src.facade.java.com.my.db.Statement;
import src.facade.java.com.my.db.Transaction;

public class DataBaseFacade {
    public void execute(String sql) {
        Statement statement = new Statement(sql);
        Connection connection = new Connection();
        Transaction transaction = new Transaction();

        connection.connect("*dbUrl*");

        transaction.beginTransaction();
        connection.executeStatement(statement);
        System.out.println(connection.getResultSet().getResult());
        transaction.endTransaction();
    }
}
