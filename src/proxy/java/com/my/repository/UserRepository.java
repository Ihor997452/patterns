package src.proxy.java.com.my.repository;

import src.prototype.java.com.my.db.model.User;

public class UserRepository implements Repository<User, Integer> {
    @Override
    public User get(Integer integer) {
        return new User(integer, "username", "password", "email");
    }
}
