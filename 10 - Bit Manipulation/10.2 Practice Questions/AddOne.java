public class AddOne {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(-(~x)); // 3
        
        x = -5;
        System.out.println(-(~x)); // -4
    }
}