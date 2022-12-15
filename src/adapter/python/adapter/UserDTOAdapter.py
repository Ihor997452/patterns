from src.adapter.python.dto.UserDTO import UserDTO
from src.prototype.python.db.model.User import User


class UserDTOAdapter:
    dto: UserDTO = None

    def __init__(self, user: User):
        self.dto = UserDTO(user.email, user.username)

    def getDTO(self):
        return self.dto
