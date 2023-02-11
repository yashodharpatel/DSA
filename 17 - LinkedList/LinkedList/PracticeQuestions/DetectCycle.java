package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList.Node;

public class DetectCycle {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}