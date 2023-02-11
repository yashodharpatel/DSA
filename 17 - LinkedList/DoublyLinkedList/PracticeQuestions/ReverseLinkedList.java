package DoublyLinkedList.PracticeQuestions;

import DoublyLinkedList.Operations.DoublyLinkedList;
import DoublyLinkedList.Operations.DoublyLinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.addLast(5);

        dlist.print();
        reverseLL(dlist);
        dlist.print();
    }

    private static void reverseLL(DoublyLinkedList list) {
        list.tail = list.head;

        Node prev = null;
        Node curr = list.head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        list.head = prev;
    }
}