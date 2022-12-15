from src.prototype.python.db.model.User import User
from src.proxy.pyhon.repo.Repository import Repository
from src.proxy.pyhon.repo.UserRepository import UserRepository


class UserRepositoryProxy(Repository):
    def __init__(self):
        self.repo = UserRepository()
        self.cache = {0: User(0, "surname_cache", "password_cache", "email"),
                      1: User(1, "surname_cache", "password_cache", "email"),
                      2: User(2, "surname_cache", "password_cache", "email")}

    def get(self, index: int):
        if index in self.cache.keys():
            return self.cache.get(index)

        return self.repo.get(index)