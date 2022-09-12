public class LetterstoUppercase {
    private static StringBuilder converUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        // Convert first char of first word to uppercase
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
                ;
            }
        }

        return sb;
    }

    public static void main(String[] args) {
        String str = "hi, i am yash"; // Convert first letter of each word to uppercase
        System.out.println(converUppercase(str)); // "Hi, I Am Yash"
    }
}