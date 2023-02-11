public class BacktrackingonArrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }

    private static void changeArr(int[] arr, int i, int v) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        arr[i] = v;
        changeArr(arr, i + 1, v + 1); // Recursion
        arr[i] = arr[i] - 2; // Backtracking
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}