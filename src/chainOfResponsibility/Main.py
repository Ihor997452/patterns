from src.chainOfResponsibility.python.ChainLink import ChainLink
from src.chainOfResponsibility.python.RoleCheckLink import RoleCheckLink
from src.chainOfResponsibility.python.TokenCheckLink import TokenCheckLink
from src.chainOfResponsibility.python.UserExistsCheckLink import UserExistsCheckLink

if __name__ == '__main__':
    print(ChainLink.initialize(
        UserExistsCheckLink(),
        TokenCheckLink(),
        RoleCheckLink()
    ).check("admin", "admin", "token"))

    print(ChainLink.initialize(
        UserExistsCheckLink(),
        TokenCheckLink(),
        RoleCheckLink()
    ).check("1", "1", "token"))

    print(ChainLink.initialize(
        UserExistsCheckLink(),
        TokenCheckLink(),
        RoleCheckLink()
    ).check("admin", "admin", "1"))
