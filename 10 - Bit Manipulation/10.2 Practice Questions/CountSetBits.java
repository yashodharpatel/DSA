public class CountSetBits {
    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int LSB = n & 1;
            
            if (LSB == 1) {
                count++;
            }

            n = n >> 1; // Remove last digit from n
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}