package Stack.PracticeQuestions;

import java.util.Stack;

public class reverseAString {
    public static void main(String[] args) {
        String str = "abc";

        String reversedStr = reverseString(str);
        System.out.print(reversedStr);
    }

    private static String reverseString(String str) {
        Stack<Character> ch = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            ch.push(str.charAt(i));
        }

        StringBuilder newStr = new StringBuilder();
        while (!ch.isEmpty()) {
            newStr.append(ch.pop());
        }

        return newStr.toString();
    }
}
