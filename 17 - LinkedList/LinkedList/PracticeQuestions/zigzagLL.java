package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class zigzagLL {
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

        zigzag(list);
        list.print();
    }

    private static Node zigzag(LinkedList list) {
        // Step 1: find midNode of LL
        Node midNode = findMid(list.head);

        // Step 2: Reverse half LL
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Alternative merging
        Node leftHead = list.head;
        Node rightHead = prev;
        Node leftNext, rightNext;

        while (leftHead != null && rightHead != null) {
            leftNext = leftHead.next;
            leftHead.next = rightHead;
            rightNext = rightHead.next;
            rightHead.next = leftNext;

            leftHead = leftNext;
            rightHead = rightNext;
        }

        return list.head;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid
    }
}
