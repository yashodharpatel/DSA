public class MaxSubarraySum {
    // Max Subarray sum using brutefroce approach [Time Complexity = O(n^3)]
    public static void maxSubarraySum(int array[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(array[k]+ " ");
                    currSum += array[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                if (currSum < minSum) {
                    minSum = currSum;
                }
                // System.out.println(currSum);
            }
        }
        System.out.println("max sum = " + maxSum);
        System.out.println("min sum = " + minSum);
    }

    // Max Subarray sum using prefix sum approach [Time Complexity = O(n^2)]
    public static int maxSubarrayPrefixSum(int array[]) {
        int prefixArray[] = new int[array.length];

        prefixArray[0] = array[0];
        // calculate prefix array
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + array[i];
        }

        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    // Max Subarray sum using Kadane's Algorithm [Time Complexity = O(n)]
    public static int maxSubarraySumKadaneAlgo(int array[]) {
        int currSum = 0, maxSum = 0, maxNegativeNumber = array[0];
        boolean negative = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                // When array contains positive value
                negative = false;
            }

            currSum += array[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);

            // maximum number in array
            maxNegativeNumber = Math.max(maxNegativeNumber, array[i]);
        }
        if (negative) {
            return maxNegativeNumber;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // maxSubarraySum(numbers);
        // maxSubarrayPrefixSum(numbers);
        System.out.println(maxSubarraySumKadaneAlgo(numbers));
    }
}