import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Sorted and roated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        checkPairSum(list, result, 16);
        System.out.println(result);
    }

    private static boolean checkPairSum(ArrayList<Integer> list, ArrayList<Integer> result, int target) {
        int breakingPoint = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) { // breaking point
                breakingPoint = i;
                break;
            }
        }

        int leftPointer = breakingPoint + 1; // smallest;
        int rightPointer = breakingPoint; // largest
        int n = list.size();

        while (leftPointer != rightPointer) {
            // case 1
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                result.add(leftPointer);
                result.add(rightPointer);
                return true;
            }

            // case 2
            if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % n;
            } else {
                // case 3
                rightPointer = (n + rightPointer - 1) % n;
            }
        }

        return false;
    }
}