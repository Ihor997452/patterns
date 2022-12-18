from src.chainOfResponsibility.python.ChainLink import ChainLink


class UserExistsCheckLink(ChainLink):
    def check(self, username: str, password: str, token: str) -> bool:
        if username == "admin" and password == "admin":
            return self.next(username, password, token)
        elif username == "1" and password == "1":
            return self.next(username, password, token)
        return False
