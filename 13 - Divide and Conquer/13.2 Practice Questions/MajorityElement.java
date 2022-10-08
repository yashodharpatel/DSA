public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        majorityElement(nums);
    }

    private static void majorityElement(int[] nums) {
        int numsMax = arrMax(nums, 0, Integer.MIN_VALUE);
        int temp[] = new int[numsMax+1];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < temp.length; i++) {
            max = Math.max(max, temp[i]);
        }

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == max){
                System.out.println(i);
            }
        }
    }

    public static int arrMax(int[] arr, int i, int max) {
        if (i == arr.length) {
            return max;
        }

        max = Math.max(max, arr[i]);
        arrMax(arr, i + 1, max);
        return max;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
