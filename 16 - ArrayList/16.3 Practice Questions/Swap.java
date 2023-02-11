import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(4);

        System.out.println(list);
        swap(1, 3, list);
        System.out.println(list);
    }

    private static void swap(int i, int j, ArrayList<Integer> list) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}