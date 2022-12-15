package src.iterator.java.com.my;

import src.bridge.java.com.my.abstraction.Message;
import src.prototype.java.com.my.db.model.User;

public class UserList {
    private final Node head;

    public UserList(Node head) {
        this.head = head;
    }

    public Node iterator() {
        return head;
    }

    public static class Node implements Iterator {
        private final User current;
        private final Node next;

        public Node(User current, Node next) {
            this.current = current;
            this.next = next;
        }

        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "current=" + current +
                    '}';
        }

        public Node getNext() {
            if (hasNext()) {
                return next;
            }

            return this;
        }
    }
}
