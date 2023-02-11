package LinkedList.PracticeQuestions;
import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class PalindromeLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(4);
        list.addLast(6);
        list.print();
        System.out.println(isPalindrome(list.head));
    }

    public static boolean isPalindrome(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: find midNode
        Node mid = findMid(head);

        // Step 2: Reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare 1st and 2nd halfs
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}