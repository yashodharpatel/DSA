import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int num = sc.nextInt();

        int binary = convertDecimalToBinary(num);
        System.out.println(binary);
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

    public static int convertDecimalToBinary(int n) {
        int binary = 0, base = 10, pow = 0;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * calculatePower(base, pow));
            n /= 2;
            pow++;
        }

        return binary;
    }
}