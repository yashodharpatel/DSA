public class WhileLoop {
    public static void main(String[] args) {
        int i = 1, n = 5, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}