package Queue.Implementation.Array;

public class ArrayQ {
    static class Queue {
        static int qSize;
        static int arr[];
        static int rear;

        Queue(int n) {
            arr = new int[n];
            qSize = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == qSize - 1;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];

            // shift all elements one by one forward as element on 1st position is removed
            // and it is blank
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            // shift rear as well
            rear = rear - 1;

            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0]; // front
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
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
