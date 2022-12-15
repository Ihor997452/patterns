package src.adapter;

import src.adapter.java.com.my.adapter.UserDTOAdapter;
import src.prototype.java.com.my.db.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(0, "username", "password", "email");
        System.out.println(new UserDTOAdapter(user).getDto());
    }
}
