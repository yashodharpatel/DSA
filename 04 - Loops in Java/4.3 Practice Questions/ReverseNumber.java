public class ReverseNumber {
    public static void main(String[] args) {
        // int n = 7654321;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n /= 10;
        // }

        int n = 7654321, reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(reverse);
    }
}