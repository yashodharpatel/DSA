package Queue.PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void reverseAqueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Push all elements of Queue to Stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Push all elements from Stack to Queue, so that now this time they will be
        // stored in reverse order in queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseAqueue(q);

        // Print the Queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");

        }
        System.out.println();
    }
}