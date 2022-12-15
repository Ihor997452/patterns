package src.prototype;

import src.prototype.java.com.my.db.model.User;

public class Main {
    public static void main(String[] args) {
        User user0 = new User(0, "username", "password", "email");
        User user1 = (User) user0.copy();

        System.out.println(user0);
        System.out.println(user1);

        user0.setEmail("eeee");
        user1.setPassword("pppp");

        System.out.println(user0);
        System.out.println(user1);

        User user2 = (User) user1.copy();
        System.out.println(user2);
    }
}
