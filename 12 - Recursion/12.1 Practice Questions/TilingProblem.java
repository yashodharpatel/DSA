public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }

    private static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizantal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
}