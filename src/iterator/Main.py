from src.iterator.python.UserList import UserList, Node
from src.proxy.pyhon.proxy.UserRepositoryProxy import UserRepositoryProxy

if __name__ == '__main__':
    lastNode = Node(UserRepositoryProxy().get(2), Node(None, None))
    secondNode = Node(UserRepositoryProxy().get(1), lastNode)
    startNode = Node(UserRepositoryProxy().get(0), secondNode)

    users = UserList(startNode)

    iterator = users.iterator()
    while iterator.has_next():
        print(iterator)
        iterator = iterator.get_next()
