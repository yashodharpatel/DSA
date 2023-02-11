// Note - 
// 1) We have not build the logic for this que, just copy pasted the solution of it, please understand the question
// 2) This is not a optimized approach for this problem, watch youtube video for it

package LinkedList.PracticeQuestions;

import LinkedList.Operations.LinkedList;
import LinkedList.Operations.LinkedList.Node;

public class MergeKSortedLL {
    public static void main(String[] args) {
        LinkedList resList = new LinkedList();
        
        int k = 3; // size of array
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        resList.head = mergeKLists(arr, k - 1);
        resList.print();
    }

    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0, j = last;

            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j)
                    last = j;
            }
        }

        return arr[0];
    }

    public static Node SortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null)
            return b;
        else if (b == null)
            return a;
        if (a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        } else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }
}