import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

	public int fib_tabulation(int n) {
		if (n <= 1) // base cases
			return n;

		int[] cache = new int[n + 1];
		cache[1] = 1; // update the second number

		// go over each number and update the Fibonacci sequence
		for (int i = 2; i <= n; i++) {
			cache[i] = cache[i - 1] + cache[i - 2];
		}

		return cache[n];

		/*
		time: O(n), n is the given number
		space: O(n), n is for the created arr
		 */

	}


	private Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 0, 1, 1));

	public int fib_top_down(int n) {
		// solve using memoization
		if (cache.containsKey(n))
			return cache.get(n);

		cache.put(n, fib_top_down(n - 1) + fib_top_down(n - 2));
		return cache.get(n);

	}
}
