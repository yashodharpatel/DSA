package DoublyLinkedList.PracticeQuestions;

import DoublyLinkedList.Operations.DoublyLinkedList;
import DoublyLinkedList.Operations.DoublyLinkedList.Node;

public class PrintReverse {
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.addLast(5);

        dlist.print();
        printReverse(dlist);
    }

    private static void printReverse(DoublyLinkedList list) {
        Node temp = list.tail;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}