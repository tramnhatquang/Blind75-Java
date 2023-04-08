import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


	public List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<>();

		// traverse thr each number from 1 to n inclusively
		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			if (i % 3 == 0)
				sb.append("Fizz");
			if (i % 5 == 0)
				sb.append("Buzz");
			if (sb.isEmpty())
				sb.append(Integer.toString(i));

			// add the StringBuilder to the result arr
			res.add(sb.toString());

		}

		return res;
	}
    /*
    Time: O(n), n is the range from 1 to n
    Space: O(n)
    */

}