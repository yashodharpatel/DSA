import java.util.Scanner;

public class Average {
    public static int calculateAverage(int a, int b, int c) { 
        int result = (a+b+c)/3;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(calculateAverage(a, b, c)); 
        sc.close();
    }
}