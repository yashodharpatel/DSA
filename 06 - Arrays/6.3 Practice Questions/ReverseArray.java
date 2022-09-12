import java.util.Scanner;

public class ReverseArray {
    public static int[] getReverseArray(int array[]) {
        int firstIndex = 0, lastIndex = array.length - 1;

        while (firstIndex < lastIndex) {
            // swap first and last elements
            int temp = array[firstIndex];
            array[firstIndex] = array[lastIndex];
            array[lastIndex] = temp;
            
            firstIndex++;
            lastIndex--;
        }

        return array;
    }

    public static void main(String[] args) {
        int size = 0;

        // Input the size of an array
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int numArray[] = new int[size];

        // Input the array
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }

        // Reverse the array
        getReverseArray(numArray);

        // Print the reversed array
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }

        sc.close();
    }
}