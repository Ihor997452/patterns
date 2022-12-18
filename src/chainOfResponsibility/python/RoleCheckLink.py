from src.chainOfResponsibility.python.ChainLink import ChainLink


class RoleCheckLink(ChainLink):
    def check(self, username: str, password: str, token: str) -> bool:
        if username == "admin":
            print("admin")
            return True

        print("user")
        return self.next(username, password, token)
