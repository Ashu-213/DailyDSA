class Solution {

    int[][] dp;

    public int solve(int[][] grid, int i, int j) {

        int m = grid.length;
        int n = grid[0].length;

        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        if (j + 1 < n) {
            right = solve(grid, i, j + 1);
        }

        if (i + 1 < m) {
            down = solve(grid, i + 1, j);
        }

        return dp[i][j] = grid[i][j] + Math.min(right, down);
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        dp = new int[m][n];

        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }

        return solve(grid, 0, 0);
    }
}