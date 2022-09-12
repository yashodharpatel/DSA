import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        if (n >= 2) {
            if (n == 2) {
                System.out.println(n + " is a prime number");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) { // n is multiple of i (where is not equal to 1 to n)
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n + " is a prime number");
                } else {
                    System.out.println(n + " is not a prime number");
                }
            }
        } else {
            System.out.println("Prime numbers are greater than 1");
        }

        sc.close();
    }
}