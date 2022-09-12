public class BinarySearch {
    private static int binarySearch(int[] array, int key) {
        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (array[mid] == key) { // found
                return mid;
            }
            if (array[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12, 16 };
        int key = 10;

        int index = binarySearch(array, key);

        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println(index);
        }
    }
}