public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 8 };
        int n = 0;
        checkIfArrayIsSorted(arr, n);
    }

    public static void checkIfArrayIsSorted(int[] arr, int n) {
        if (n == arr.length-1) {
            System.out.println("true");
            return;
        }

        if (arr[n] > arr[n + 1]) {
            System.out.println("false");
        } else {
            checkIfArrayIsSorted(arr, n + 1);
        }
    }
}
