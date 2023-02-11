package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class SwappingNodes {
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
        swapNodesData(list1, 2);
        list1.print();

        LinkedList list2 = new LinkedList();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(7);
        list2.addLast(8);

        list2.print();
        swapNodesData(list2, 2, 4);
        list2.print();

        LinkedList list3 = new LinkedList();
        list3.addLast(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(4);
        list3.addLast(5);
        list3.addLast(6);
        list3.addLast(7);
        list3.addLast(8);

        list3.print();
        swapNodes(list3, 2, 4);
        list3.print();
    }

    // You are given a linked list, and an integer k.
    // Return the head of the linked list after swapping the values of the kth node
    // from the beginning and the kth node from the end (the list is 1-indexed).
    private static Node swapNodesData(LinkedList list, int k) {
        Node fast = list.head;
        Node slow = list.head;
        Node first = list.head;
        Node second = list.head;

        int i = 0;

        // Put fast (k-1) nodes after slow
        while (i < k - 1) {
            fast = fast.next;
            i++;
        }

        // Save the node for swapping
        first = fast;

        // Move until the end of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Save the second node for swapping
        // Note that the pointer second isn't necessary: we could use slow for swapping
        // as well
        // However, having second improves readability
        second = slow;

        // Swap values
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return list.head;
    }

    // Swap the data in a list at index i and j
    private static Node swapNodesData(LinkedList list, int i, int j) {
        if (i == j) {
            return list.head;
        }

        Node first = list.head, second = list.head;

        int idx = 0;

        while (idx < i - 1) {
            first = first.next;
            idx++;
        }

        idx = 0;

        while (idx < j - 1) {
            second = second.next;
            idx++;
        }

        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return list.head;
    }

    // We have a linked list and two keys in it,swap nodes for two given keys.Nodes
    // should be swapped by changing links. It may be assumed that all keys in the
    // linked list are distinct.
    public static Node swapNodes(LinkedList list, int x, int y) {
        if (x == y) {
            return list.head;
        }

        Node prevX = null, currX = list.head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;

        }

        Node prevY = null, currY = list.head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return list.head;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            list.head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            list.head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return list.head;
    }
}