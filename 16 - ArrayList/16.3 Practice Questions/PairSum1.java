import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Sorted list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        checkPairSum(list, result, 5);
        System.out.println(result);
    }

    private static boolean checkPairSum(ArrayList<Integer> list, ArrayList<Integer> result, int target) {
        int leftPointer = 0, rightPointer = list.size() - 1;

        while (leftPointer != rightPointer) {
            // case 1
            if ((list.get(leftPointer) + list.get(rightPointer)) == target) {
                result.add(leftPointer);
                result.add(rightPointer);
                return true;
            }
            
            // case 2
            if ((list.get(leftPointer) + list.get(rightPointer)) < target) {
                leftPointer++;
            } else {
                // case 3
                rightPointer--;
            }
        }

        return false;
    }
}