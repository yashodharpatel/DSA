public class TypePromotion {
    public static void main(String[] args) {
        char char1 = 'a';
        char char2 = 'b';
        // char char3 = char2 - char1; // cannot convert from int to char

        System.out.println((int) (char2)); // 98
        System.out.println((int) (char1)); // 97
        System.out.println(char1); // a
        System.out.println(char2 - char1); // 1 (Automatically char type will converted to int)

        short sh = 5;
        byte bt = 25;
        char c = 'c';
        // byte byt = sh + bt + c; // cannot convert from int to byte (type promoted to
        // int)
        int byt = sh + bt + c;
        System.out.println(byt);

        int n1 = 10;
        float n2 = 20.35f;
        long n3 = 25;
        double n4 = 35;

        // long ans = n1 + n2+ n3 + n4; // cannot convert from double to long (type
        // promoted to double because largest data type was double)

        double ans = n1 + n2 + n3 + n4;
        System.out.println(ans);

        byte by = 5;
        // byte ay = by * 2; // cannot convert from int to byte (type converted to int
        // while doing the operation)
        byte ay = (byte) (by * 2);
        System.out.println(ay);
    }
}