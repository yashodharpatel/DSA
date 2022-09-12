import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        // Creation of array by giving size 5
        int marks[] = new int[5];

        // Direct decalration without giving size
        int numbers[] = {1, 2, 3};
        System.out.println(numbers[0]); // 1

        Scanner sc = new Scanner(System.in);

        // Input of array from user
        for (int i = 0; i < marks.length; i++) {
            marks[i]= sc.nextInt();
        }

        // Print array marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        
        sc.close();
    }
}