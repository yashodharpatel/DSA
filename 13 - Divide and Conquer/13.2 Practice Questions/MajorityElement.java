// Given an array nums of size n, return the majority element. 
// The majority element is the element that appears more than [n/2] times.
// You may assume that the majority element always exists in the array.
// Tutorial - https://youtu.be/AoX3BPWNnoE

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    // brute-force approach - [TC = O(n^2)]
    // private static int majorityElement(int[] nums) {
    //     int majorityElementCount = nums.length / 2;

    //     for (int i = 0; i < nums.length; i++) {
    //         int count = 0;

    //         for (int j = 0; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 count += 1;
    //             }
    //         }

    //         if (count > majorityElementCount) {
    //             return nums[i];
    //         }
    //     }

    //     return -1;
    // }

    // optimized approach [Moore Voting Algorithm - TC = O(n)]
    private static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return candidate;
    }
}