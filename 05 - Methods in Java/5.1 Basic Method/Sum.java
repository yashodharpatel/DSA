import java.util.Scanner;

public class Sum {
    public static int calculateSum(int a, int b, int c) { // a, b and c are parameters or formal parameters
        int result = a+b+c;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(calculateSum(a, b, c)); // a, b and c are arguments or actual parameters
        sc.close();
    }
}