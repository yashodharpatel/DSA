public class NQueensCountways {
    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        System.out.println(count);
    }

    private static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = 'x';
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        int duprow = row;
        int dupcol = col;

        while (row >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
        }

        row = duprow;
        col = dupcol;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (row >= 0 && col < board.length) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col++;
        }

        return true;
    }
}
