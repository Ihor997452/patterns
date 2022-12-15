package src.proxy;

import src.proxy.java.com.my.proxy.UserRepositoryProxy;
import src.proxy.java.com.my.repository.Repository;

public class Main {
    public static void main(String[] args) {
        Repository repository = new UserRepositoryProxy();
        System.out.println(repository.get(0));
        System.out.println(repository.get(1));
        System.out.println(repository.get(2));
        System.out.println(repository.get(3));
    }
}
