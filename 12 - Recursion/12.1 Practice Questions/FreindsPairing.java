public class FreindsPairing {
    public static void main(String[] args) {
        System.out.println(freindsPairing(3));
    }

    private static int freindsPairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // single = freindsPairing(n - 1)
        // pair = freindsPairing(n - 2) * (n - 1)

        // return single + pair
        return freindsPairing(n - 1) + freindsPairing(n - 2) * (n - 1);
    }
}
