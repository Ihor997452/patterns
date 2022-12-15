from abc import ABC, abstractmethod


class Clickable(ABC):
    @abstractmethod
    def click(self):
        pass
