from src.chainOfResponsibility.python.ChainLink import ChainLink


class TokenCheckLink(ChainLink):
    def check(self, username: str, password: str, token: str) -> bool:
        if token == "token":
            return self.next(username, password, token)

        return False
