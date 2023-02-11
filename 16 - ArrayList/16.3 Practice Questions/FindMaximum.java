import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(1);

        System.out.println(findMax(list));
    }

    private static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}