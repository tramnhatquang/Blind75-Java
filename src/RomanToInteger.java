import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	private int convertRomanToInt(char c) {
		switch (c) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;

		}
		return 0;
	}

	public int romanToInt(String s) {
        /*
        III -> 3

        X  V I I I -> 18

        total = 10 +  5 + 1 + 1 + 1 = 18

        IX -> 9
        total = 10 - 1 = 9, curr = 2

        XIX -> 19
        XIV -> 14

    */

		int total = 0, len = s.length();
		// int curr = 0;
		for (int i = 0; i < len; i++) {
			int currentVal = convertRomanToInt(s.charAt(i));
			if (i + 1 < len) {
				int nextVal = convertRomanToInt(s.charAt(i + 1));
				if (currentVal < nextVal)
					total -= currentVal;
				else
					total += currentVal;
			} else {
				total += currentVal;
			}
		}

		return total;
	}

	public int romanToInt_1(String s) {
        /*
        III -> 3

        X  V I I I -> 18

        total = 10 +  5 + 1 + 1 + 1 = 18

        IX -> 9
        total = 10 - 1 = 9, curr = 2

        XIX -> 19
        XIV -> 14

        */
		Map<Character, Integer> mapRomanToValue = new HashMap<>();
		mapRomanToValue.put('I', 1);
		mapRomanToValue.put('V', 5);
		mapRomanToValue.put('X', 10);
		mapRomanToValue.put('L', 50);
		mapRomanToValue.put('C', 100);
		mapRomanToValue.put('D', 500);
		mapRomanToValue.put('M', 1000);

		int total = 0, curr = 0, len = s.length();
		// int curr = 0;
		while (curr < len) {
			// check if the curr character's value is >= next character's value and there is at least 2 characters
			if (curr + 1 < len && mapRomanToValue.get(s.charAt(curr)) < mapRomanToValue.get(s.charAt(curr + 1))) {
				total += mapRomanToValue.get(s.charAt(curr + 1)) - mapRomanToValue.get(s.charAt(curr));
				curr += 2;
			} else {
				total += mapRomanToValue.get(s.charAt(curr));
				curr += 1;
			}
		}

		return total;
	}
}
