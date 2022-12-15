package src.proxy.java.com.my.proxy;

import src.prototype.java.com.my.db.model.User;
import src.proxy.java.com.my.repository.Repository;
import src.proxy.java.com.my.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryProxy implements Repository<User, Integer> {
    private final Map<Integer, User> cache = new HashMap<>();
    private final UserRepository repository;

    public UserRepositoryProxy() {
        this.repository = new UserRepository();
        cache.put(0, new User(0, "surname_cache", "password_cache", "email"));
        cache.put(1, new User(1, "surname_cache", "password_cache", "email"));
        cache.put(2, new User(2, "surname_cache", "password_cache", "email"));
    }

    public User get(Integer id) {
        if (cache.containsKey(id)) {
            return cache.get(id);
        }

        return repository.get(id);
    }
}
