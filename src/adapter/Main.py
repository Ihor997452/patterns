from src.adapter.python.adapter.UserDTOAdapter import UserDTOAdapter
from src.prototype.python.db.model.User import User

if __name__ == '__main__':
    user = User(0, "username", "password", "email")
    print(UserDTOAdapter(user).getDTO())
