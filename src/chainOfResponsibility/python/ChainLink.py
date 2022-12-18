from abc import ABC, abstractmethod


class Link(ABC):
    @abstractmethod
    def check(self, username: str, password: str, token: str) -> bool:
        pass

    @abstractmethod
    def next(self, username: str, password: str, token: str) -> bool:
        pass


class ChainLink(Link, ABC):
    nextLink: Link = None

    @staticmethod
    def initialize(head: Link, *chain: Link):
        current: Link = head
        for n in chain:
            current.nextLink = n
            current = n

        return head

    def next(self, username: str, password: str, token: str) -> bool:
        if self.nextLink is not None:
            return self.nextLink.check(username, password, token)

        return True
