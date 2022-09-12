import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int n) {
        int factorial;

        if (n < 2) {
            factorial = 1;
        } else {
            factorial = n * calculateFactorial(n-1);
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        int num = sc.nextInt();

        System.out.println(calculateFactorial(num));
        sc.close();
    }
}