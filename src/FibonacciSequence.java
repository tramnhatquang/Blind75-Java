import java.rmi.server.ExportException;

public class FibonacciSequence {


	static int returnNthFibonacciSequence(int n) throws Exception {
		// return the n-th number in the fibonacci sequence

		// if the first number starts at 0
		/*
		f(0) = 0
		f(1) = 1
		f(2) = 1
		f(n) = f(n - 1) + f(n - 2) if n >= 2
		 */
		// base cases
		if (n < 0)
			throw new Exception("Invalid number. Number must either be 0 or positive number");
		if (n == 0 || n == 1)
			return n;

		// bottom-up approach
		int[] arr = new int[n + 1];
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[n];
	}

}
