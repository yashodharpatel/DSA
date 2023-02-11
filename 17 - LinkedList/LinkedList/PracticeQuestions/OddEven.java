package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class OddEven {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(7);
        list1.addLast(8);

        list1.print();
        OddEvenListByData(list1);
        list1.print();

        LinkedList list2 = new LinkedList();
        list2.addLast(2);
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(4);
        list2.addLast(7);
        list2.addLast(8);

        list2.print();
        OddEvenListByIdx(list2);
        list2.print();
    }

    // We have a Linked List of integers,write a function to modify the linked list
    // such that all even numbers appear before all the odd numbers in the modified
    // linked list. Also, keep the order of even and odd numbers same.
    private static void OddEvenListByData(LinkedList list) {
        Node evenLL = new Node(-1);
        Node eventemp = evenLL;

        Node oddLL = new Node(-1);
        Node oddtemp = oddLL;

        Node temp = list.head;

        while (temp != null) {
            if (temp.data % 2 == 0) { // even
                eventemp.next = temp;
                eventemp = eventemp.next;
            } else { // odd
                oddtemp.next = temp;
                oddtemp = oddtemp.next;
            }

            if (temp.next == null) { // for last element
                eventemp.next = null;
                oddtemp.next = null;
            }
            temp = temp.next;
        }

        eventemp.next = oddLL.next;
        list.head = evenLL.next;
    }

    // Given a singly linked list, group all the nodes with odd indices together
    // followed by the nodes with even indices, and return the reordered list.
    private static void OddEvenListByIdx(LinkedList list) {
        Node evenLL = new Node(-1);
        Node eventemp = evenLL;

        Node oddLL = new Node(-1);
        Node oddtemp = oddLL;

        Node temp = list.head;
        int i = 0;

        while (temp != null) {
            if (i % 2 == 0) { // even
                eventemp.next = temp;
                eventemp = eventemp.next;
            } else { // odd
                oddtemp.next = temp;
                oddtemp = oddtemp.next;
            }

            if (temp.next == null) { // for last element
                eventemp.next = null;
                oddtemp.next = null;
            }
            temp = temp.next;
            i++;
        }

        eventemp.next = oddLL.next;
        list.head = evenLL.next;
    }
}