package src.singleton.java.com.my.db.dao;

import src.prototype.java.com.my.db.model.User;

public class UserDao extends AbstractDao<User, Integer> {
    private static UserDao instance;

    private UserDao() {}

    public static synchronized UserDao getInstance() {
        if (instance == null) {
            instance = new UserDao();
        }

        return instance;
    }
}
