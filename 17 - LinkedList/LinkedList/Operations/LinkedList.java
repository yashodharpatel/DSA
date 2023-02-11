package LinkedList.Operations;

public class LinkedList {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++; // Increment the size of linked list by 1, if new node is added to it

        // Check if linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: newNode next = head
        newNode.next = head; // link

        // Step 3: head = newNode
        head = newNode;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node prev = head;
        int i = 0;

        while (i < index - 1) { // Traverse until a prev node reaches to index-1 pos
            prev = prev.next;
            i++;
        }

        Node newNode = new Node(data);
        size++;
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; // -infinity
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int remove(int index) {
        if (index == 0) {
            return removeFirst();
        }

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; // -infinity
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;
        int val = curr.data;
        prev.next = curr.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; // -infinity
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key) { // O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1; // key not found
    }

    public int recusiveSearch(Node temp, int key) { // O(n)
        if (temp == null) {
            return -1;
        }

        // If we found key on index 0, return 0 (i.e. first element = key)
        if (temp.data == key) {
            return 0;
        }

        int index = recusiveSearch(temp.next, key);

        if (index == -1) {
            return -1;
        } else {
            index = index + 1;
            return index;
        }
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(2);
        list.addFirst(1);

        list.addLast(4);
        list.addLast(5);

        list.add(2, 3);

        list.print(); // 1->2->3->4->5->null
        System.out.println(list.size); // 5

        // list.removeFirst();
        // list.print();

        // list.removeLast();
        // list.print();

        // list.remove(2);
        // list.print();

        System.out.println(list.iterativeSearch(4));
        System.out.println(list.iterativeSearch(15));

        System.out.println(list.recusiveSearch(list.head, 4));
        System.out.println(list.recusiveSearch(list.head, 15));
    }
}