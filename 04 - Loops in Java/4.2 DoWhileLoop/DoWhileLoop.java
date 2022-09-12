import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 2;
        do {
            System.out.println(" Hello world ");
        } while (n > 4);

        try (
            Scanner sc = new Scanner(System.in)) {
            int evenSum = 0, oddSum = 0;
            do {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
                System.out.println("Sum of even numbers : " + evenSum);
                System.out.println("Sum of odd numbers : " + oddSum);
            } while (true);
        }
    }
}