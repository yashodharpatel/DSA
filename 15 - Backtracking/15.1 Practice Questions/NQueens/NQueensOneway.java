public class NQueensOneway {
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        if (nQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No ways available!!");
        }
    }

    private static boolean nQueens(char[][] board, int row) {
        if (row == board.length) {
            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = 'x'; // Backtracking
            }
        }

        return false;
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
}