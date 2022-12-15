from abc import ABCMeta, abstractmethod


class Entity(metaclass=ABCMeta):
    def __init__(self, index):
        self.index = index

    @abstractmethod
    def copy(self):
        pass
