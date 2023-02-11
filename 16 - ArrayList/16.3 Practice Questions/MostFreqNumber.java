import java.util.ArrayList;

public class MostFreqNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        System.out.println(mostFreqNumberFollowingKey(list, 1));
    }

    private static int mostFreqNumberFollowingKey(ArrayList<Integer> list, int key) {
        int[] freqNumbers = new int[1001];

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                freqNumbers[list.get(i + 1)]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int result = 0;

        for (int i = 0; i < freqNumbers.length; i++) {
            if (freqNumbers[i] > max) {
                max = freqNumbers[i];
                result = i;
            }
        }

        return result;
    }
}