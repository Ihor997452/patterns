import copy

from src.prototype.python.db.model.Entity import Entity


class User(Entity):
    def __init__(self, index, username, password, email):
        super().__init__(index)
        self.username = username
        self.password = password
        self.email = email

    def to_string(self):
        return ("User{" +
                "id=" + str(self.index) +
                ", username='" + self.username + '\'' +
                ", password='" + self.password + '\'' +
                ", email='" + self.email + '\'' +
                '}')

    def __str__(self):
        return self.to_string()

    def __repr__(self):
        return self.to_string()

    def copy(self):
        return copy.deepcopy(self)

