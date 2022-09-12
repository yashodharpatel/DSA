public class BinaryExponentiation {
    // base = a, exponent = n
    private static int calculatePow(int a, int n) {
        int ans = 1;

        while (n > 0) {
            // Get Last digit (LSB)
            int LSB = n & 1;

            if (LSB != 0) { // Check if last digit is not equal to 0
                ans = ans * a;
            }
            
            // Square of a
            a = a * a;

            // Remove LSB from n
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculatePow(3, 5));
        
        // Note - for a negative value of n watch striver's video
    }
}