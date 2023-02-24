package Queue.Implementation.CollectionFW;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionFWQ {
    public static void main(String[] args) {
        // Java Collection Framework Queue is not a class, it's a interface and we can't
        // make objects of interfaces so we create objects of classes which implements
        // queue
        // In java, 2 classes implements queue
        // 1) LinkedList
        // 2) ArrayDeque

        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // print
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
