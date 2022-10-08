public class RoatedSortedArray {
    // Iterative Approach
    public static int search(int[] nums, int target) {
        int si = 0, ei = nums.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // if left side is sorted
            if (nums[si] <= nums[mid]) {
                // figure out if element lies on left half or not
                if (nums[si] <= target && target <= nums[mid]) {
                    ei = mid - 1; // check in left half
                } else {
                    si = mid + 1; // check in right half
                }
            }
            // right half is sorted
            else {
                if (nums[mid] <= target && target <= nums[ei]) {
                    si = mid + 1; // check in right half
                } else {
                    ei = mid - 1; // check in left half
                }
            }
        }
        return -1;
    }

    // Reccursive Approach
    public static int search(int[] nums, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // if left side is sorted
        if (nums[si] <= nums[mid]) {
            // figure out if element lies on left half or not
            if (nums[si] <= target && target <= nums[mid]) {
                return search(nums, target, si, mid - 1); // check in left half
            } else {
                return search(nums, target, mid + 1, ei); // check in right half
            }
        }
        // right half is sorted
        else {
            if (nums[mid] <= target && target <= nums[ei]) {
                return search(nums, target, mid + 1, ei); // check in right half
            } else {
                return search(nums, target, si, mid - 1); // check in left half
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 }, target = 0;
        System.out.println(search(nums, target));
        System.out.println(search(nums, target, 0, nums.length - 1));
    }
}