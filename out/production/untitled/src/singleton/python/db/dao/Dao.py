from src.singleton.python.com.my.Singleton import Singleton


class Dao(metaclass=Singleton):
    _dbMock = []

    def __init__(self):
        pass

    def save(self, entity):
        self._dbMock.append(entity)

    def update(self, entity, index):
        self._dbMock[index] = entity

    def delete(self, index):
        self._dbMock.pop(index)

    def get(self, index):
        return self._dbMock[index]

    def get_all(self):
        return self._dbMock
