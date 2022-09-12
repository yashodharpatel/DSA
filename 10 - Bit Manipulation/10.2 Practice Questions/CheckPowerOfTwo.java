public class CheckPowerOfTwo {
    private static boolean checkIfNIsPowerOfTwo(int n) {
        return (n & n - 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkIfNIsPowerOfTwo(7));
    }
}