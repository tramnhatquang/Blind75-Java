import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {


	public int[][] merge(int[][] intervals) {
		if (intervals == null || intervals.length == 0)
			return new int[0][];

		// sort all intervals based on the startTime
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		LinkedList<int[]> merged = new LinkedList<>();
		for (int[] interval : intervals) {
			if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
				// append the curr interval into the LinkedList
				merged.add(interval);
			} else {
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			}
		}

		return merged.toArray(new int[merged.size()][]);


	}

    /*
    -time: O(n log n) due to the sort
    - space: O(log n)
    */

	public static void main(String[] args) {
		int[][] arr = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}};
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}
