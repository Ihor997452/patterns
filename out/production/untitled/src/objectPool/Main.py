from src.objectPool.python.ConnectionPool import ConnectionPool

if __name__ == '__main__':
    connectionPool = ConnectionPool(1, 2)
    connection = connectionPool.get()
    connection1 = connectionPool.get()

    connection.do_stuff()
    connection1.do_stuff()

    connection2 = connectionPool.get()
    print(connection2)

    connectionPool.free(connection)
    connectionPool.free(connection1)

    print(connectionPool.connections)
