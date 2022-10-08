public class LastOccurene {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 8, 8 };
        int key = 8;
        int i = arr.length - 1;
        System.out.println(getLastOccurence(arr, key, i));
    }

    private static int getLastOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = getLastOccurence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
}
