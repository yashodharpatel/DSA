package Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Implementation {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addLast(3); // 2 1 3
        deque.addLast(4); // 2 1 3 4
        deque.addLast(5); // 2 1 3 4 5
        System.out.println(deque);

        deque.removeFirst(); // 1 3 4 5
        System.out.println(deque);

        deque.removeLast(); // 1 3 4
        System.out.println(deque);

        System.out.println("First el = " + deque.getFirst());
        System.out.println("Last el = " + deque.getLast());
    }
}