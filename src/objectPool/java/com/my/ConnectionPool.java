package src.objectPool.java.com.my;

import java.util.Hashtable;
import java.util.Map;

public class ConnectionPool {
    long size;
    long maxSize;
    Hashtable<Connection, Boolean> pool;

    public ConnectionPool(long initialSize, long maxSize) {
        this.size = initialSize;
        this.maxSize = maxSize;
        this.pool = new Hashtable<>();
        fill();
    }

    public Connection get() {
        if (pool.containsValue(true)) {
            Connection connection = pool
                    .entrySet()
                    .stream()
                    .filter(Map.Entry::getValue)
                    .findFirst()
                    .get()
                    .getKey();

            pool.put(connection, false);
            return connection;
        }

        if (size >= maxSize) {
            return null;
        }

        this.expand();
        return this.get();
    }

    public void free(Connection connection) {
        if (pool.get(connection) != null) {
            pool.put(connection, true);
        }
    }

    private void expand() {
        for (int i = 0; i < size; i++) {
            Connection key = new Connection();
            this.pool.put(key, true);
        }

        this.size = this.pool.size();
    }

    private void fill() {
        for (int i = 0; i < size; i++) {
            Connection key = new Connection();
            this.pool.put(key, true);
        }
    }
}
