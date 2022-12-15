from src.singleton.python.db.dao.Dao import Dao
from src.prototype.python.db.model.User import User

if __name__ == "__main__":
    dao = Dao()

    dao.save(User(0, "username0", "password0", "email0"))
    dao.save(User(1, "username1", "password1", "email1"))

    dao1 = Dao()

    dao1.update(User(1, "usr1", "psw1", "eml1"), 1)

    dao1.save(User(2, "username2", "password2", "email2"))
    dao1.save(User(3, "username3", "password3", "email3"))

    print(dao.get_all())

    print(dao1.get(1))
    print(dao.get(3))

    dao1.delete(2)
    dao.delete(0)

    print(dao1.get_all())

    print(dao)
    print(dao1)
