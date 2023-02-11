import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element [TC - O(1)]
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Add Element [TC - O(n)]
        list.add(2, 5);
        System.out.println(list);

        // Get Element [TC - O(1)]
        int ele = list.get(2);
        System.out.println(ele);

        // Remove Element [TC - O(n)]
        list.remove(1);
        System.out.println(list);

        // Set Element [TC - O(n)]
        list.set(2, 9);
        System.out.println(list);

        // Contains Element [TC - O(n)]
        System.out.println(list.contains(4));
        System.out.println(list.contains(8));

        // Size of List
        System.out.println(list.size());

        // Print ArrayList (Method 1)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Print ArrayList (Method 2)
        System.out.println(list);
    }
}
