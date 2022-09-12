public class DiagonalSum {
    private static int diagonalSum(int[][] matrix) {
        int sum = 0;

        // Time Complexity - O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         // Primary Diagonal
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         // Secondary Diagonal
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            // i + j = n - 1
            // j = n - 1 - i (n = matrix.length)
            if (i != matrix.length - 1 - i) { // i != j (Duplicate element should not be covered)
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(matrix));
    }
}
