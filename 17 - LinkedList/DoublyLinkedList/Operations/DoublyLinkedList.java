package DoublyLinkedList.Operations;

public class DoublyLinkedList {
    public static class Node {
        public Node prev;
        public int data;
        public Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void add(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node prev = head;
        int i = 0;

        while (i < index - 1) {
            prev = prev.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next.prev = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int remove(int index) {
        if (index == 0) {
            return removeFirst();
        }

        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();

        dlist.addFirst(2);
        dlist.addFirst(1);

        dlist.addLast(5);
        dlist.addLast(6);
        dlist.addLast(7);
        dlist.addLast(8);

        dlist.add(3, 2);
        dlist.add(4, 3);

        dlist.print();

        dlist.removeFirst();
        dlist.print();

        dlist.removeLast();
        dlist.print();

        dlist.remove(3);
        dlist.print();
    }
}