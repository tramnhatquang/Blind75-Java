import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		if (s == null && s.length() == 0)
			return 0;

		int longestLength = 0;
		Map<Character, Integer> mapCharToLastIndex = new HashMap<>();
		int startIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (mapCharToLastIndex.containsKey(currentChar)) {
				// update the start  index
				startIndex = Math.max(startIndex, mapCharToLastIndex.get(currentChar) + 1);
			}
			// put the curr char and its index into the hash map
			mapCharToLastIndex.put(currentChar, i);

			// compute the longest length we find so far
			longestLength = Math.max(longestLength, i - startIndex + 1);
		}

		return longestLength;

	}
    /*
    - time: O(n), n is length of the whole string
    - space: O(n)
    */

}
