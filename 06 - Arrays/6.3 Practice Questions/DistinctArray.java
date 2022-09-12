public class DistinctArray {
    public static boolean checkDistinctArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 1, 3, 4};
        System.out.println(checkDistinctArray(numbers));
    }
}
