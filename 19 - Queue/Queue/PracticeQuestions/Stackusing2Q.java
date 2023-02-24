package Queue.PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Stackusing2Q {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // If both queues are empty, then only we can say stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push the data in non-empty queue
        public static void push(int data) { // O(1)
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() { // O(n)
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // case 1 - if elements are stored in q1
            if (!q1.isEmpty()) {
                // remove all elements from q1 till it gets empty
                while (!q1.isEmpty()) {
                    top = q1.remove(); // for storing value of last element
                    if (q1.isEmpty()) {
                        break;
                    } else { // if it is not last element then push it into q2
                        q2.add(top);
                    }
                }
            } else { // case 2 - if elements are stored in q2
                // remove all elements from q2 till it gets empty
                while (!q2.isEmpty()) {
                    top = q2.remove(); // for storing value of last element
                    if (q2.isEmpty()) {
                        break;
                    } else { // if it is not last element then push it into q1
                        q1.add(top);
                    }
                }
            }

            return top; // returns last element of queue
        }

        public static int peek() { // O(n)
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // case 1 - if elements are stored in q1
            if (!q1.isEmpty()) {
                // remove all elements from q1 till it gets empty and push to q2
                while (!q1.isEmpty()) {
                    top = q1.remove(); // for storing value of last element
                    q2.add(top); // push all the elements of q1 to q2
                }
            } else { // case 2 - if elements are stored in q2
                // remove all elements from q2 till it gets empty and push to q1
                while (!q2.isEmpty()) {
                    top = q2.remove(); // for storing value of last element
                    q1.add(top); // push all the elements of q2 to q1
                }
            }

            return top; // returns last element of queue
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
