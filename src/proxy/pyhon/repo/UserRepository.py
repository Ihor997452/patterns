from src.prototype.python.db.model.User import User
from src.proxy.pyhon.repo.Repository import Repository


class UserRepository(Repository):
    def get(self, index: int):
        return User(index, "username", "password", "email");
