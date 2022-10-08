public class PrintNoInIncreasingOrder {
    public static void main(String[] args) {
        int n = 10;
        printInIncreasingOrder(n);
    }

    private static void printInIncreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        printInIncreasingOrder(n - 1);

        System.out.println(n);
    }
}
