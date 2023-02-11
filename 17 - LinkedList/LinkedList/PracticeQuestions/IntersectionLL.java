package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList.Node;

public class IntersectionLL {
    public static void main(String[] args) {
        Node head1, head2, newNode;
        head1 = new Node(10);
        head2 = new Node(3);
        
        newNode = new Node(6);
        head2.next = newNode;
        
        newNode = new Node(9);
        head2.next.next = newNode;
        
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        
        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node res = getIntersectionNode(head1, head2);
        System.out.println(res.data);
    }

    private static Node getIntersectionNode(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != temp2) {
            if(temp1 != null){
                temp1 = temp1.next;
            } else {
                temp1 = head2;
            }

            if(temp2 != null){
                temp2 = temp2.next;
            } else {
                temp2 = head1;
            }
        }

        return temp2; // return temp1;
    }
}
