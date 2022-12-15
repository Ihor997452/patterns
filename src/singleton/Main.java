package src.singleton;

import src.singleton.java.com.my.db.dao.UserDao;
import src.prototype.java.com.my.db.model.User;

public class Main {
    public static void main(String[] args) {
        UserDao dao = UserDao.getInstance();
        dao.save(new User(0, "username0", "password0", "email0"));
        dao.save(new User(1, "username1", "password1", "email1"));
        dao.save(new User(2, "username2", "password2", "email2"));

        UserDao dao1 = UserDao.getInstance();
        System.out.println(dao1.getAll());

        dao1.update(new User(1, "user", "pass", "e"), 1);
        dao1.save(new User(3, "uss", "pp", "eee"));

        System.out.println(dao);
        System.out.println(dao1);

        System.out.println(dao.getAll());
    }
}
