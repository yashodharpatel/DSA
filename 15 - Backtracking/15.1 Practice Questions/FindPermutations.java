// Optimized Approach
public class FindPermutations {
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void findPermutationsArr(int[] arr, int pointer) {
        if (pointer == arr.length) {
            printArr(arr);
            return;
        }

        for (int i = pointer; i < arr.length; i++) {
            swap(i, pointer, arr);
            findPermutationsArr(arr, pointer + 1);
            swap(i, pointer, arr);
        }
    }

    private static void findPermutationsStr(String str, int pointer) {
        if (pointer == str.length()) {
            System.out.println(str);
            return;
        }

        for (int i = pointer; i < str.length(); i++) {
            // swap
            char ch[] = str.toCharArray();
            char temp = ch[i];
            ch[i] = ch[pointer];
            ch[pointer] = temp;

            findPermutationsStr(new String(ch), pointer + 1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutationsStr(str, 0);

        int arr[] = { 1, 2, 3 };
        findPermutationsArr(arr, 0);
    }
}