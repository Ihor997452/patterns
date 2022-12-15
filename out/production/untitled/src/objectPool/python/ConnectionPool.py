from typing import Dict

from src.objectPool.python.Connection import Connection


class ConnectionPool:
    size: int = None
    maxSize: int = None
    connections: Dict[Connection, bool] = {}

    def __init__(self, size: int, maxSize: int):
        self.size = size
        self.maxSize = maxSize
        self.fill()

    def get(self):
        if True in self.connections.values():
            for item in self.connections.items():
                if item[1]:
                    self.connections[item[0]] = False
                    return item[0]

        if self.size >= self.maxSize:
            return None

        self.expand()
        return self.get()

    def free(self, connection: Connection):
        if self.connections[connection]:
            self.connections[connection] = True

    def expand(self):
        for i in range(self.size):
            key = Connection()
            self.connections[key] = True

        self.size = len(self.connections)

    def fill(self):
        for i in range(self.size):
            key = Connection()
            self.connections[key] = True
