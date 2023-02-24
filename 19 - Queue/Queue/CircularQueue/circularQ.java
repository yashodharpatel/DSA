package Queue.CircularQueue;

public class circularQ {
    static class circularQueue {
        static int qSize;
        static int arr[];
        static int rear;
        static int front;

        circularQueue(int n) {
            arr = new int[n];
            qSize = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % qSize == front; // we are trying to update rear and on next index front is there, i.e.
                                                // Queue is full
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            if (front == -1) { // Initial state
                front = 0;
            }

            rear = (rear + 1) % qSize;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // Condition to check if there is only single element left in Queue
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % qSize;
            }

            return result;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        circularQueue queue = new circularQueue(5);
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
