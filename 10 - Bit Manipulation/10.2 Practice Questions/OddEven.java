public class OddEven {
    public static void checkEvenorOdd(int num) {
        int bitMask = 1;

        // LSB = num AND bitMask
        if ((num & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenorOdd(3);
        checkEvenorOdd(4);
        checkEvenorOdd(11);
    }
}