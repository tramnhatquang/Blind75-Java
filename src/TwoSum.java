import java.util.HashMap;
import java.util.Map;

public class TwoSum {



	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> mapNumberToIndex = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complimentary = target - nums[i];
			if (mapNumberToIndex.containsKey(complimentary)) {
				return new int[]{mapNumberToIndex.get(complimentary), i};
			}

			// store the curr number and its index into the map
			mapNumberToIndex.put(nums[i], i);
		}

		return null;

	}

	// time: O(n), n is length of nums arr
	// space: O(n)

}
