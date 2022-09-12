public class LinearSearch {
    public static int linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12, 16 };
        int key = 10;

        int index = linearSearch(array, key);

        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println(index);
        }
    }
}