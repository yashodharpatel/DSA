// Google Interview Question
// https://youtu.be/t_f0nwwdg5o
public class Gridways {
    public static void main(String[] args) {
        int n = 3, m = 4; // n x m grid
        System.out.println(uniqueWays(0, 0, n, m));
        System.out.println(uniqueWays(n, m));
    }

    // bruteforce approach [TC - O(2^n), SC - O(2^n)] - exponential
    private static int uniqueWays(int i, int j, int n, int m) {
        // base cases
        if (i == n - 1 && j == m - 1) // condition for last cell
            return 1;

        if (i == n || j == m) // boundary cross
            return 0;

        int w1 = uniqueWays(i + 1, j, n, m); // down -> next row
        int w2 = uniqueWays(i, j + 1, n, m); // right -> next col
        return w1 + w2; // total ways
    }

    // optimized approach [TC - O(m-1) - linear, SC - O(1) - constant]
    private static int uniqueWays(int n, int m) {
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }

        return (int) res;
    }
}