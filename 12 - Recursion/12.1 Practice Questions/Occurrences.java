public class Occurrences {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        findOccurrences(arr, 2, 0);
    }

    private static void findOccurrences(int[] arr, int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.println(i);
        }

        findOccurrences(arr, key, i + 1);
    }
}