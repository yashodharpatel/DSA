package Queue.PracticeQuestions;

import java.util.Stack;

public class Qusing2Stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>(); // primary
        static Stack<Integer> s2 = new Stack<>(); // temporary

        // We can say, if s1 is empty i.e. entire Queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) { // O(n)
            if (s1.isEmpty()) {
                s1.push(data);
            } else {
                // move all elements if s1 to s2
                // s1 -> s2
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }

                // push data in s1
                s1.push(data);

                // move all elements if s2 to s1
                // s2 -> s1
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        public static int remove() { // O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop(); // remove top of s1
        }

        public static int peek() { // O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek(); // return top of s1
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
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