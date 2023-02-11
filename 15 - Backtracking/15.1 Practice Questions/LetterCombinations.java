import java.util.ArrayList;

public class LetterCombinations {
    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void main(String[] args) {
        System.out.println(letterCombinations("273"));
    }

    private static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>(); // result ArrayList

        if (digits.length() == 0) { // If length of a given String is 0 then there will be no combinations present
            return res;
        }

        bfs(0, new StringBuilder(""), digits, res); // Call the function for pos = 0, i.e. first digit of a string
        return res;
    }

    private static void bfs(int pos, StringBuilder sb, String digits, ArrayList<String> res) {
        if (pos == digits.length()) { // If we are on the the last digit of string i.e. we have checked every pos,
                                      // then add the substring to res as we have added 1 char each from every key
            res.add(sb.toString());
            return;
        }

        char[] letters = L[Character.getNumericValue(digits.charAt(pos))]; // The fn converts char to numeric value,
                                                                           // i.e. '2' -> 2

        // Traverse each char of array 'letters' for every pos of string 'digits' i.e.
        // for
        // every digit in a string
        for (int i = 0; i < letters.length; i++) {
            bfs(pos + 1, new StringBuilder(sb).append(letters[i]), digits, res);
        }
    }
}