public class MinimumPathSum {

	public int minPathSum(int[][] grid) {
        /*
        Solve this prob using DP
        Notice that dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]
        - We can intialize the 2d array of dp to solve this problem


        */
		// saniy check
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;

		int ROWS = grid.length, COLS = grid[0].length;
		int[][] dp = new int[ROWS][COLS];

		dp[0][0] = grid[0][0];
		// fill out the first col
		for (int i = 1; i < ROWS; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}

		// fill out the first row
		for (int i = 1; i < COLS; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}

		// now we fill out all cells in the 2d array
		for (int i = 1; i < ROWS; i++) {
			for (int j = 1; j < COLS; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
			}
		}

		return dp[ROWS - 1][COLS - 1];


	}

}
