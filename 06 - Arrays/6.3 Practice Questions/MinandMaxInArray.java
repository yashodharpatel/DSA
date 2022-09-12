public class MinandMaxInArray {
    public static void getMinMax(int array[]) {
        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        getMinMax(numbers);
    }
}