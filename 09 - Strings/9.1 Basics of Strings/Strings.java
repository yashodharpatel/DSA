import java.util.Scanner;

public class Strings {
    private static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Input/Output
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // Yashodhar
        System.out.println(word);
        String sentence = sc.nextLine(); // Yashodhar Patel
        System.out.println(sentence);

        // length of String
        String str = "Yashodhar Patel";
        System.out.println(str.length()); // 15

        // Concatenation
        String firstName = "Yashodhar";
        String lastName = "Patel";
        String fullName = firstName + " " + lastName; // Yashodhar Patel
        System.out.println(fullName);

        // charAt Method
        String name = "Yashodhar Patel";
        System.out.println(name.charAt(0)); // Y
        System.out.println(name.charAt(2)); // s

        printCharacters(name);

        // equals() fn
        String s1 = "Yash";
        String s3 = new String("Yash");

        if (s1.equals(s3)) { // If we use here s1 == s3, it will print not equal
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // substring() fn
        String s2 = "Yash";
        System.out.println(s2.substring(0, 3)); // Yas

        sc.close();
    }
}