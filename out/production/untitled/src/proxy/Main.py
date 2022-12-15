from src.proxy.pyhon.proxy.UserRepositoryProxy import UserRepositoryProxy

if __name__ == '__main__':
    repository = UserRepositoryProxy()
    print(repository.get(0))
    print(repository.get(1))
    print(repository.get(2))
    print(repository.get(3))
