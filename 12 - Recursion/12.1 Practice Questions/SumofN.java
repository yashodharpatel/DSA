public class SumofN {
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        }

        int sum = n + calculateSum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(calculateSum(n));
    }
}
