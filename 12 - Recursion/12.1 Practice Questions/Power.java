public class Power {
    public static void main(String[] args) {
        int base = 2;
        int expo = 10;
        System.out.println(calculatePower(base, expo));
    }

    private static int calculatePower(int base, int expo) {
        // Base case
        if (expo == 0) {
            return 1;
        }

        // Approach 1 [O(n)]
        // int power = base * calculatePower(base, expo - 1);
        // return power;

        // Approach 2 [Optimized - O(logn)]
        int halfPower = calculatePower(base, expo / 2);
        int halfPowersq = halfPower * halfPower;

        if (expo % 2 != 0) {
            if (expo > 0) {
                return halfPowersq * base;
            } else {
                return halfPowersq / base; // if expo is negative
            }
        }

        return halfPowersq;
    }
}
