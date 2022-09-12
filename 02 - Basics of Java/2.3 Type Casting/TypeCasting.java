public class TypeCasting {
    public static void main(String[] args) {
        float num1 = 12.45f;
        // int num2 = num1;
        // Above line will give error, we need to do typecasting here
        int num2 = (int) num1;
        System.out.println(num2); // 12

        char ch = 'a';
        int num = ch;
        System.out.println(num);
    }
}