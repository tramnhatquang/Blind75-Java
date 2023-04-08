import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MainProgram {


	public static void main(String[] args) {
//		testIteratingOverMap();
//		testBinarySearch();
//		testMyOwnBinarySearch();
//		testPrimitiveArray();
		testCustomSort();
		int a = 0;
		a += 2;
		System.out.println(a);
	}

	static void testCustomSort() {
		int[][] arr = new int[][] {{5, 6}, {1, 5}, {1, 3}, {2, 4}, {7, 12}};
		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		for (var a: arr) {
			System.out.println(Arrays.toString(a));
		}
	}


	static void testBuiltInBinarySearch() {
		// my own binary search
		System.out.println(Arrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 12)); // -8
		System.out.println(Arrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 1)); // 0

	}

	static void testMyOwnBinarySearch() {
		System.out.println(myBinarySearch(new int[]{1, 2, 3, 4}, 4)); // 3
		System.out.println(myBinarySearch(new int[]{1}, 0)); // 0
		System.out.println(myBinarySearch(new int[]{1, 2, 3, 4}, 5)); //4

	}

	static int myBinarySearch(int[] arr, int target) {
		/*
		Return the index of the target in the arr if target exists in the arr. Otherwise, return the index where
		target be inserted but still maintain the sorted order of the arr
		 */
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return left;

		// time: O(log n), space: O(1)
	}

	static void testIteratingOverMap() {
		Map<Character, Integer> map = new HashMap<>();
		map.put('a', 2);
		map.put('b', 3);
		map.put('c', 5);
		map.put('d', 7);
		map.put('e', 9);

		// Iterating thr each key and val
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}


		// Iterating thr all values
		for (var val: map.values()) {
			System.out.println(val);
		}

		// iterating thr each key
		for (var key: map.keySet()) {
			System.out.println("Key: " + key);
		}
	}

	static void testPrimitiveArray() {
		String a = "anagram";
		char[] charArray = a.toCharArray();
		System.out.println("Before sorting: " + Arrays.toString(charArray));
		Arrays.sort(charArray);
		System.out.println("After sorting: " + Arrays.toString(charArray));

		int[] intArray = new int[] {1, -34, 5, 4, 3};
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));

	}

}
