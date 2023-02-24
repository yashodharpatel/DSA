package Stack.PracticeQuestions;

import java.util.Stack;

public class nextGreaterEle {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 0, 1, 3 };

        int greaterEle[] = new int[nums.length];

        calNextGreEle(nums, greaterEle);

        for (int i = 0; i < greaterEle.length; i++) {
            System.out.print(greaterEle[i] + " ");
        }
    }

    public static void calNextGreEle(int[] nums, int[] greaterEle) {
        // brute-force - O(n^2)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] < nums[j]) {
        //             greaterEle[i] = nums[j];
        //             break;
        //         } else {
        //             greaterEle[i] = -1;
        //         }
        //     }
        // }

        // O(n)
        Stack<Integer> s = new Stack<>();

        for (int i = nums.length-1; i >= 0; i--) {
            while (!s.isEmpty() && nums[i] > nums[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                greaterEle[i] = -1;
            } else {
                greaterEle[i] = nums[s.peek()];
            }

            s.push(i);
        }
    }

    // Variations of this question
    // next Greater left - change the for loop to 0 to n
    // next smaller right - change the condition in while loop
    // next smaller left - change the for loop as well as the condition in while loop
}
