package Stack.PracticeQuestions;

import java.util.Stack;
// import Stack.PracticeQuestions.pushAtBottom;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverseAStack(s);
        printStack(s);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverseAStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseAStack(s);
        pushEleAtBottom.pushAtBottom(s, top); 
    }
}
