public class InvresionCount {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }

    // brute-force
    // private static int invresionCount(int[] arr) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] > arr[j] && i < j) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    private static int mergeSort(int[] arr, int si, int ei) {
        int count = 0;

        if (ei > si) {
            int mid = (si + ei) / 2;
            count = mergeSort(arr, si, mid);
            count += mergeSort(arr, mid + 1, ei);

            count += merge(arr, si, mid, ei);
        }

        return count;
    }

    private static int merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left array
        int j = mid + 1; // iterator for right array
        int k = 0; // iterator for temp array

        int count = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] = arr[j++];
                count = count + ((mid - i) + 1);
            }
        }

        // leftover part for left array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // leftover part for right array
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp array in orignal array
        for (k = 0, i = si; i <= ei; k++, i++) {
            arr[i] = temp[k];
        }

        return count;
    }
}