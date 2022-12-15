package src.objectPool;

import src.objectPool.java.com.my.Connection;
import src.objectPool.java.com.my.ConnectionPool;

public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(1, 2);
        Connection connection = pool.get();
        Connection connection1 = pool.get();

        connection.doStuff();
        connection1.doStuff();

        Connection connection2 = pool.get();
        System.out.println(connection2);

        pool.free(connection);
        pool.free(connection1);
        System.out.println(pool);
    }
}
