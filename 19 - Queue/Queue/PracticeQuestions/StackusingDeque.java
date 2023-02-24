package Queue.PracticeQuestions;

import java.util.Deque;
import java.util.LinkedList;

public class StackusingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return deque.removeLast();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek = " + s.peek());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}