package LinkedList.PracticeQuestions;
import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.print();
        reverseLinkedList(list);
        list.print();
    }

    public static void reverseLinkedList(LinkedList list) {
        list.tail = list.head;

        Node prev = null;
        Node curr = list.head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        list.head = prev;
    }
}