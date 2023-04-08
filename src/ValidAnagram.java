import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public boolean isAnagram_1(String s, String t) {
		// sanity check
		if (s.length() != t.length())
			return false;

		// since we deal with only 26 lowercase letters
		int[] countOccurrences = new int[26];

		// count the occurrence of e(ach char in s
		for (int i = 0; i < s.length(); i++) {
			countOccurrences[s.charAt(i) - 'a']++;
			countOccurrences[t.charAt(i) - 'a']--;
		}

		// two words are valid anagrams if count of each char is the same
		for (int i : countOccurrences) {
			if (i != 0)
				return false;
		}

		return true;

        /*
        Time: O(n), n is length of s
        Space: O(26) = O(1)
        */

	}

	public boolean isAnagram_2(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();

		// count the freq of each Character
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// iterate thr each char in the second string t
		for (char c : t.toCharArray()) {
			// if the curr char is not in hash map
			if (!map.containsKey(c))
				return false;
			// if the freq of curr char is not enough
			if (map.get(c) == 0)
				return false;
			// decrement the freq of the curr char
			map.put(c, map.get(c) - 1);

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0)
				return false;
		}

		return true;
		// time


	}
}
