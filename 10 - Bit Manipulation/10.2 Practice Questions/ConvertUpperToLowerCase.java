public class ConvertUpperToLowerCase {
    private static char convertToLowerCase(char c) {
        int result = c | ' ';
        return (char) (result);
    }

    public static void main(String[] args) {
        // for (char ch = 'A'; ch <= 'Z'; ch++) {
        //     System.out.println((char) (ch | ' '));
        //     // prints abcdefghijklmnopqrstuvwxyz}
        // }

        System.out.println(convertToLowerCase('A'));
        System.out.println(convertToLowerCase('D'));
        System.out.println(convertToLowerCase('Y'));
    }
}
