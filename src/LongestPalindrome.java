import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {


	public int longestPalindrome(String s) {
		// count the freq of each char in string s
		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// System.out.println("Map: " + map);


		int longestPalindromeCount = 0;
		boolean isOdd = false;
		for (int val : map.values()) {
			// find an even freq
			if (val % 2 == 0)
				// take everything
				longestPalindromeCount += val;
			else {
				// find an odd freq
				longestPalindromeCount += val - 1;
				isOdd = true;
			}
		}

		if (isOdd)
			longestPalindromeCount++;
		return longestPalindromeCount;


	}
	/*
	Time: O(n^2), n is length of string
	Space: O(1)
	 */
}
