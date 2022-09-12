public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // swap numbers
        a = a ^ b; // 011 (3)
        b = a ^ b; // 101 (5)
        a = a ^ b; // 110 (6)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
