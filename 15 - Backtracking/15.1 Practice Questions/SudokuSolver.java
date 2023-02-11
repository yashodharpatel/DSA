// https://takeuforward.org/data-structure/sudoku-solver/
public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                { '9', '5', '7', '.', '1', '3', '.', '8', '4' },
                { '4', '8', '3', '.', '5', '7', '1', '.', '6' },
                { '.', '1', '2', '.', '4', '9', '5', '3', '7' },
                { '1', '7', '.', '3', '.', '4', '9', '.', '2' },
                { '5', '.', '4', '9', '7', '.', '3', '6', '.' },
                { '3', '.', '9', '5', '.', '8', '7', '.', '1' },
                { '8', '4', '5', '7', '9', '.', '6', '1', '3' },
                { '.', '9', '1', '.', '3', '6', '.', '7', '5' },
                { '7', '.', '6', '1', '8', '5', '4', '.', '9' }
        };

        sudokuSolver(board);

        // Print Board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    private static boolean sudokuSolver(char[][] board) {
        // Traverse to each cell of board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == '.') { // Check If cell is empty
                    // Try to put numbers from 1 to 9 on that cell
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isSafe(board, row, col, ch)) {// Check if numbers fits to that cell else try for other
                                                          // number
                            board[row][col] = ch; // Put the number if it fits to the cell
                            if (sudokuSolver(board)) { // Check for other remaining cells of the board
                                return true;
                            } else {
                                board[row][col] = '.'; // At some stage we are not able to put any number just
                                                       // backtrack, because we have put wrong numbers
                            }
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isSafe(char[][] board, int row, int col, char ch) {
        // row
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == ch) {
                return false;
            }
        }

        // col
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == ch) {
                return false;
            }
        }

        // grid
        int startingRow = (row / 3) * 3;
        int startingCol = (col / 3) * 3;
        for (int r = startingRow; r < startingRow + 3; r++) {
            for (int c = startingCol; c < startingCol + 3; c++) {
                if (board[r][c] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
}