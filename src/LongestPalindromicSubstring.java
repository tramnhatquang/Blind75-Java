public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		int len = s.length();
		if (len == 0 || s == null)
			return "";

		int longestLength = 1;
		int startIndex = 0; // starting index of the longest palindrome

		for (int i = 0; i < s.length(); i++) {
			int oddLength = expandAroundCenter(s, i, i);
			int evenLength = expandAroundCenter(s, i, i + 1);
			int currentLength = Math.max(oddLength, evenLength);
			if (currentLength > longestLength) {
				longestLength = currentLength;
				startIndex = i - (currentLength - 1) / 2;
			}
		}

		return s.substring(startIndex, startIndex + longestLength);
	}

	private int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		// the loop will end once the char at left and right are not the same. Left and right are off by 1
		left++;
		right--;
		return right - left + 1;
	}
}
