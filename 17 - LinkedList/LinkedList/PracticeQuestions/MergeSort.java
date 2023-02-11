package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class MergeSort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(5);
        list.addLast(4);
        list.addLast(6);
        list.addLast(2);
        list.addLast(1);

        list.print();
        list.head = mergeSort(list.head);
        list.print();
    }

    public static Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: find midNode
        Node midNode = findMid(head);

        // Step 2: Call mergeSort for left and right part
        Node rightHead = midNode.next;
        midNode.next = null;

        Node newLeftHead = mergeSort(head); // leftpart
        Node newRightHead = mergeSort(rightHead); // rightpart

        // Step 3: Merge
        return merge(newLeftHead, newRightHead);
    }

    private static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
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