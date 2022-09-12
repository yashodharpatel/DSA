public class TransposeMatrix {
    private static void transposeMatrix(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        printMatrix(transpose);
    }

    private static void printMatrix(int[][] array) {
        int row = array.length;
        int col = array[0].length;

        // Print the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        printMatrix(array);
        transposeMatrix(array);
    }
}