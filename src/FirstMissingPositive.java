public class FirstMissingPositive {

	public int firstMissingPositive(int[] nums) {
		// solve using cyclic sort
        /*
        we put each positive number into its corrected index position. For ex:
        1 goes into 0-indexed
        2 goes into 1-indexed
        so on and so forth

        - At the end, we traverse thr each number and index  and check if (index + 1) != curr number -> return index + 1
        Otherwise, returns length of nums  + 1 since the missing positive number is out of range

        */

		if (nums == null || nums.length == 0)
			return 1;

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			while (nums[i] > 0 && nums[i] < n && nums[nums[i] - 1] != nums[i])
				// swap the current number into its correct index
				swap(nums, i, nums[i] - 1);
		}

		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}

		return n + 1;


	}
	/*
	Time: O(n), n is length of arr
	Space: O(1)
	 */

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}


}
