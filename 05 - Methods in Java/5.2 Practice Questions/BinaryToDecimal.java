import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number: ");
        int num = sc.nextInt();

        int decimal = convertBinaryToDecimal(num);
        System.out.println(decimal);
        sc.close();
    }

    // Java provides Math.pow() to do the same
    public static int calculatePower(int base, int exponent) {
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }
        return power;
    }

    public static int convertBinaryToDecimal(int n) {
        int decimal = 0, base = 2, pow = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal = decimal + (lastDigit * calculatePower(base, pow));
            n /= 10;
            pow++;
        }

        return decimal;
    }
}