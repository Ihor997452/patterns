from src.prototype.python.db.model.User import User

if __name__ == '__main__':
    user0 = User(0, "username", "password", "email")
    user1 = user0.copy()

    print(user0)
    print(user1)

    user0.email = "eeee"
    user1.password = "pppp"

    print(user0)
    print(user1)

    user2 = user1.copy()
    print(user2)
