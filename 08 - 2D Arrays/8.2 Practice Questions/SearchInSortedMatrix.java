public class SearchInSortedMatrix {
    private static boolean stairCaseSearch(int[][] matrix, int key) {
        // By assuming the starting point as top right position
        // int row = 0, col = matrix[0].length - 1;
        // while (row <= matrix.length - 1 &&  col >= 0) {
        //     if(key == matrix[row][col]) {
        //         System.out.println("key found at index " + row + "," + col);
        //         return true;
        //     } 
        //     else if(key < matrix[row][col]) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }
        // System.out.println("key not found");
        // return false;

        // By assuming the starting point as bottom left position
        int row = matrix.length - 1, col = 0;
        while (row >= 0 &&  col < matrix[0].length) {
            if(key == matrix[row][col]) {
                System.out.println("key found at index " + row + "," + col);
                return true;
            } 
            else if(key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 90;
        stairCaseSearch(matrix, key);
    }
}