import java.util.Scanner;

public class TwoDArrays {
    public static boolean searchInMatrix(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at index " + i + "," + j);
                    return true;
                }
            }
        }

        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 3, col = 3;
        int matrix[][] = new int[row][col];

        // System.out.println(matrix.length); // 3 - Number of rows
        // System.out.println(matrix[0].length);// 3 - Number of cols

        // Input the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchInMatrix(matrix, 7);

        sc.close();
    }
}