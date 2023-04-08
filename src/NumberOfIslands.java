public class NumberOfIslands {


	private void dfs(char[][] grid, boolean[][] visited, int row, int col, int ROWS, int COLS) {
		if (row < 0 || row >= ROWS || col < 0 || col >= COLS || grid[row][col] == '0' || visited[row][col])
			return;

		// mark the current grid as true since we already visited it
		visited[row][col] = true;
		dfs(grid, visited, row + 1, col, ROWS, COLS);
		dfs(grid, visited, row - 1, col, ROWS, COLS);
		dfs(grid, visited, row, col + 1, ROWS, COLS);
		dfs(grid, visited, row, col - 1, ROWS, COLS);

	}

	public int numIslands(char[][] grid) {
        /*
        Solve using DFS
        1. Traverse  thr each cell in the 2d arr and when we meet an island. We will start the DFS from that island.
        For the next island we met during the DFS process, we mark it as '0'. If we go out of bound or meet a water,
        we return back from the current recursive call. For every island we meet during the 2d arr iteration, that's
        total number of islands we find so far
        */

		int count = 0;
		int ROWS = grid.length, COLS = grid[0].length;
		boolean[][] visited = new boolean[ROWS][COLS];
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				if (grid[row][col] == '1' && !visited[row][col]) {
					count++;
					dfs(grid, visited, row, col, ROWS, COLS);
				}

			}
		}
		return count;
	}

    /*
    - time: O(n * m) , n, m are number of rows, cols in the 2d matrix
    - space: O(1), since we do not use any extra space. We modified the given input
    */
}
