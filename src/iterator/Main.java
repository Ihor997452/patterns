package src.iterator;

import src.iterator.java.com.my.UserList;
import src.proxy.java.com.my.proxy.UserRepositoryProxy;

public class Main {
    public static void main(String[] args) {
        var lastNode = new UserList.Node(new UserRepositoryProxy().get(2), new UserList.Node(null, null));
        var secondNode = new UserList.Node(new UserRepositoryProxy().get(1), lastNode);
        var startNode = new UserList.Node(new UserRepositoryProxy().get(0), secondNode);

        var users = new UserList(startNode);

        var iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator);
            iterator = iterator.getNext();
        }
    }
}
