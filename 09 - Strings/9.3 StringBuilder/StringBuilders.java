public class StringBuilders {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append("world");
        // System.out.println(sb);
        // System.out.println(sb.length());

        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}