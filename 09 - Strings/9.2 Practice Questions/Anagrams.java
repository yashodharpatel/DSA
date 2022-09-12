import java.util.Arrays;

public class Anagrams {
    private static boolean checkAnagrams(String str1, String str2) {
        // Convert Strings to lowercase. Why? so that we don't have to check separately
        // for lower & upper case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char array
            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();

            // Sort the char array
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            // if the sorted char arrays are same or identical then the strings are anagram
            return Arrays.equals(str1Arr, str2Arr); // returns boolean value
        } else {
            // case when lengths are not equal
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        System.out.println(checkAnagrams(str1, str2));
    }
}