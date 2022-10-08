public class DuplicatesInString {
    public static void main(String[] args) {
        String str = "appnnacollege";
        int index = 0;
        StringBuilder distinctStr = new StringBuilder("");
        boolean track[] = new boolean[26];

        removeDuplicates(str, index, distinctStr, track);
    }

    private static void removeDuplicates(String str, int index, StringBuilder distinctStr, boolean track[]) {
        if (index == str.length() - 1) {
            System.out.println(distinctStr);
            return;
        }

        char currChar = str.charAt(index);
        if (track[currChar - 'a']) {
            // duplicate
            removeDuplicates(str, index + 1, distinctStr, track);
        } else {
            track[currChar - 'a'] = true;
            distinctStr.append(currChar);
            removeDuplicates(str, index + 1, distinctStr, track);
        }
    }
}