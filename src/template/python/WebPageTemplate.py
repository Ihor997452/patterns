from abc import ABC, abstractmethod

from src.chainOfResponsibility.python.ChainLink import ChainLink
from src.chainOfResponsibility.python.RoleCheckLink import RoleCheckLink
from src.chainOfResponsibility.python.TokenCheckLink import TokenCheckLink
from src.chainOfResponsibility.python.UserExistsCheckLink import UserExistsCheckLink


class WebPageTemplate(ABC):
    def show(self):
        self.check()
        self.header()
        self.content()
        self.footer()

    def check(self):
        if (ChainLink.initialize(
            UserExistsCheckLink(),
            TokenCheckLink(),
            RoleCheckLink()
        ).check("1", "1", "token")):
            print("logged in")
        else:
            print("not logged in")

    @abstractmethod
    def header(self): pass
    @abstractmethod
    def content(self): pass

    @abstractmethod
    def footer(self): pass
