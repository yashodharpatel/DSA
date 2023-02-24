package Queue.PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interleaveQueue(q);

        // print Queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    // TC - O(n)
    // SC - O(n)
    public static void interleaveQueue(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();

        int n = q.size();

        for (int count = 0; count < n / 2; count++) {
            firstHalf.add(q.remove());
        }

        // At the this point
        // firstHalf - 1 2 3
        // q (orignal) - 4 5 6

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        // At the this point
        // firstHalf - empty
        // q (orignal) - 1 4 2 5 3 6
    }
}
