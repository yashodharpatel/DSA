// https://takeuforward.org/data-structure/rat-in-a-maze/
public class RatInAMaze {
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int n = maze.length;
        int ans[][] = new int[n][n];
        getPaths(maze, ans, 0, 0);
        
        // Print Board
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }

    private static boolean getPaths(int[][] maze, int[][] ans, int i, int j) {
        // base case
        if (i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
            ans[i][j] = 1;
            return true;
        }

        if (isSafe(maze, i, j)) {
            if (ans[i][j] == 1) {
                return false;
            }
            ans[i][j] = 1;
            if (getPaths(maze, ans, i + 1, j)) { // down
                return true;
            }
            if (getPaths(maze, ans, i, j + 1)) { // right
                return true;
            }

            ans[i][j] = 0; // backtracking
            return false;
        }

        return false;
    }

    private static boolean isSafe(int[][] maze, int i, int j) {
        // if i, j outside maze return false
        return (i >= 0 && i < maze.length && j >= 0 && j < maze.length && maze[i][j] == 1);
    }
}
