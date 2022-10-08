public class PrintNoInDecreasingOrder {
    public static void main(String[] args) {
        int n = 10;
        printInDecreasingOrder(n);
    }

    private static void printInDecreasingOrder(int n) {
        System.out.println(n);

        if (n == 1) {
            return;
        }

        printInDecreasingOrder(n - 1);
    }
}