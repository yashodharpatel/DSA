import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(1);

        System.out.println(list);
        Collections.sort(list); // ascending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // descending (Using comparator)
        System.out.println(list);
    }
}