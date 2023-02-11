public class NKnightsTour {
    public static void main(String[] args) {
        int n = 5;
        int board[][] = new int[n][n];

        knightsTour(board, 0, 0, 1);
    }

    private static void knightsTour(int[][] board, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] > 0) {
            return;
        } else if (move == board.length * board.length) { // last move
            board[row][col] = move;
            printBoard(board);
            board[row][col] = 0;
            return;
        }

        board[row][col] = move;
        knightsTour(board, row - 2, col + 1, move + 1);
        knightsTour(board, row - 1, col + 2, move + 1);
        knightsTour(board, row + 1, col + 2, move + 1);
        knightsTour(board, row + 2, col + 1, move + 1);
        knightsTour(board, row + 2, col - 1, move + 1);
        knightsTour(board, row + 1, col - 2, move + 1);
        knightsTour(board, row - 1, col - 2, move + 1);
        knightsTour(board, row - 2, col - 1, move + 1);
        board[row][col] = 0;
    }

    private static void printBoard(int[][] board) {
        System.out.println("========== chess board ==========");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
