public class ArrayPairs {
    public static void printPairs(int array[]) {
        int totalPairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i] + "," + array[j] + " ");
                totalPairs++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs = "+totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 6, 9 };
        printPairs(numbers);
    }
}