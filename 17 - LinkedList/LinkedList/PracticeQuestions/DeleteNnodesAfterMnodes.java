package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class DeleteNnodesAfterMnodes {
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

        deleteNodes(list, 3, 2);
        list.print();
    }

    private static void deleteNodes(LinkedList list, int m, int n) {
        Node curr = list.head;
        Node t = list.head;

        while (curr != null) {
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null)
                return;

            t = curr.next;

            for (int i = 1; i <= n && t != null; i++) {
                t = t.next;
            }

            curr.next = t;
            curr = t;
        }
    }
}