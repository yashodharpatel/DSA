import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

        sc.close();
    }

    public static boolean isPalindrome(int n) {
        int n_copy = n;

        int reverse = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n /= 10;
        }

        if (n_copy == reverse) {
            return true;
        } else {
            return false;
        }
    }
}