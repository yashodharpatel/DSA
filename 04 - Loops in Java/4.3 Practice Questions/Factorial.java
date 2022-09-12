public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.print(factorial);
    }
}