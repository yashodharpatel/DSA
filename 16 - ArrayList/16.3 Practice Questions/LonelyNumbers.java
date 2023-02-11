import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(findLonely(list));
    }

    private static ArrayList<Integer> findLonely(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> result = new ArrayList<>();

        if (list.size() == 1) {
            result.add(list.get(0));
            return result;
        }

        // For first element
        if (list.get(0) != list.get(1) && ((list.get(0) + 1) != list.get(1))) {
            result.add(list.get(0));
        }

        // For last element
        if (list.get(list.size() - 1) != list.get(list.size() - 2)
                && ((list.get(list.size() - 1) - 1) != list.get(list.size() - 2))) {
            result.add(list.get(list.size() - 1));
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1) || list.get(i) == list.get(i - 1)
                    || ((list.get(i) + 1) == list.get(i + 1)) || ((list.get(i) - 1) == list.get(i - 1))) {
                continue;
            }

            result.add(list.get(i));
        }

        return result;
    }
}