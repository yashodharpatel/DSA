public class PracticeOperators {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x); // 10/2
        int exp2 = (x * (y / x)); // 2*2
        System.out.println(exp1); // 5
        System.out.println(exp2); // 4

        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y));
        // int exp2 = (y * x / y + y * x / y);
        // System.out.println(exp1); // 20
        // System.out.println(exp2); // 20
    }
}