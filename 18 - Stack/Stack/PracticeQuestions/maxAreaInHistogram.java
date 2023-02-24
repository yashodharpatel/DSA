package Stack.PracticeQuestions;

import java.util.Stack;

public class maxAreaInHistogram {
    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 }; // heights of histogram

        int maxArea = calMaxArea(heights);

        System.out.println(maxArea);
    }

    private static int calMaxArea(int[] heights) { // TC = O(3n) = O(n) -> Optimized
        int maxArea = 0;
        
        // Next Smaller Right = O(n)
        Stack<Integer> s = new Stack<>();
        int[] nextSmallerRight = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            // Remove all elements from stack until smaller element than curr element occurs
            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextSmallerRight[i] = heights.length;
            } else {
                nextSmallerRight[i] = s.peek();
            }

            s.push(i);
        }

        // Next Smaller Left = O(n)
        s = new Stack<>();
        int[] nextSmallerLeft = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            // Remove all elements from stack until smaller element than curr element occurs
            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = s.peek();
            }

            s.push(i);
        }

        // Calculate area for each bar = O(n)
        for (int i = 0; i < heights.length; i++) {
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int height = heights[i];
            int currArea = width * height;

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}
