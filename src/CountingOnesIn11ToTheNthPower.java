import java.math.BigInteger;

public class CountingOnesIn11ToTheNthPower {

	public static int countOnesIn11ToTheNthPower(int N) {
		BigInteger eleven = new BigInteger("11");
		BigInteger result = eleven.pow(N);
		String resultStr = result.toString();
		int count = 0;
		for (int i = 0; i < resultStr.length(); i++) {
			if (resultStr.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	// here is more optimized solution using the Pascal triangle algorithm
	public int countOnesIn11ToTheNthPowerOptimal(int N) {
		int[] pascalRow = new int[N + 1];
		pascalRow[0] = 1;
		for (int i = 1; i <= N; i++) {
			pascalRow[i] = 1;
			for (int j = i - 1; j > 0; j--) {
				pascalRow[j] = pascalRow[j] + pascalRow[j - 1];
			}
		}

		int count = 0;
		for (int num : pascalRow) {
			String numStr = String.valueOf(num);
			for (int i = 0; i < numStr.length(); i++) {
				if (numStr.charAt(i) == '1') {
					count++;
				}
			}
		}
		return count;
	}


	public static void main(String[] args) {
		System.out.println(countOnesIn11ToTheNthPower(1)); //2
		System.out.println(countOnesIn11ToTheNthPower(3)); //2
		System.out.println(countOnesIn11ToTheNthPower(0)); // 1
	}

}

