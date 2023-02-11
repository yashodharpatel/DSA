public class NQueensAllways {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // Initialize every place with 'x'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0); // place n queens in n rows
    }

    private static void nQueens(char[][] board, int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop
        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1); // Recursion
                board[row][col] = 'x'; // Backtracking
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        // Vertically UP
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonally Left UP
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonally Right UP
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("========== chess board ==========");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // for leetcode soln
    // private static ArrayList<String> construct(char[][] board) {
    //     ArrayList < String > res = new ArrayList < String > ();
    //     for (int i = 0; i < board.length; i++) {
    //         String s = new String(board[i]);
    //         res.add(s);
    //     }
    //     return res;
    // }
}