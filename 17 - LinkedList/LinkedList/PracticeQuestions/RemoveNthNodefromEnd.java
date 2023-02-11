package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class RemoveNthNodefromEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.print();

        removeNthfromEnd(list, 3);
        list.print();
    }

    private static Node removeNthfromEnd(LinkedList list, int n) {
        // Step 1: Calculate size of LL
        Node temp = list.head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (size == 1) {
            list.head = null;
            return list.head;
        }

        // Step 2: Calculate index from which you want to remove node
        int index = size - n;

        if (index == 0) {
            list.head = list.head.next;
            return list.head;
        }

        // Step 3: Create and point prev node to prev node of index to be removed
        Node prev = list.head;
        int i = 0;

        while (i < index - 1) {
            prev = prev.next;
            i++;
        }

        // Step 4: Point prev next to it's next's next so that middle element will be
        // removed
        prev.next = prev.next.next;

        return list.head;
    }
}