public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length -m;
        int len2 = n;
        
        int[] sol = new int[len1+len2];

        int p1 = 0, p2 = 0, p3 = 0;
        
        while(p1 < len1 && p2 < len2){
            if(nums1[p1] < nums2[p2]){
                sol[p3] = nums1[p1];
                p1++;
            } else {
                sol[p3] = nums2[p2];
                p2++;
            }
            p3++;
        }


        while(p1 < len1){
                sol[p3++] = nums1[p1++];    
        }

        while(p2 < len2){
            sol[p3++] = nums2[p2++];
        }
        
        
        nums1 = new int[sol.length];
        nums1 = sol;
        name(nums1);
    }

    public static void name(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);

    }
}
