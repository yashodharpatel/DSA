public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 8, 8 };
        int key = 8;
        int i = 0;
        System.out.println(getFirstOccurence(arr, key, i));
    }

    private static int getFirstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return getFirstOccurence(arr, key, i + 1);
    }
}