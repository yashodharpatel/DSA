public class SubArray {
    public static void printSubArray(int array[]) {
        int totalsubArrays = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }
                totalsubArrays++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total subarrays = " + totalsubArrays);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 6, 9 };
        printSubArray(numbers);
    }
}