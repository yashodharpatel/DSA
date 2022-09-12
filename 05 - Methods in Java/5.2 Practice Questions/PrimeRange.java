public class PrimeRange {
    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void getPrimeRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        getPrimeRange(2, 10);
    }
}