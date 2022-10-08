public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getNthFibonacciNumber(7));
    }

    public static int getNthFibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibonacciNumber = getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
        return fibonacciNumber;
    }
}