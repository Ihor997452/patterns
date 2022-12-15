from src.iterator.python.Iterator import Iterator
from src.prototype.python.db.model.User import User

class Node(Iterator):
    def __init__(self, current, n):
        self.current = current
        self.next = n

    def has_next(self):
        return self.current is not None

    def get_next(self):
        if self.has_next():
            return self.next

        return self

    def __str__(self):
        return ("Node{" +
                "current=" + str(self.current) +
                '}')


class UserList:
    head: Node = None

    def __init__(self, head: Node):
        self.head = head

    def iterator(self):
        return self.head
