public class MethodOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method overloading using different parameters
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading using different data-types
    public static float sum(float a, float b) {
        return a + b;
    }                                                                                     

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(2.2f, 3.0f));
    }
}