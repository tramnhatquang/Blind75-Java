import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSequenceTest {

	@Test
	public void testSequences() throws Exception {
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(1), 1);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(2), 1);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(3), 2);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(4), 3);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(5), 5);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(6), 8);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(7), 13);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(8), 21);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(9), 34);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(10), 55);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(11), 89);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(12), 144);
		assertEquals(FibonacciSequence.returnNthFibonacciSequence(13), 233);

	}
	/*
	n-th
	number

	0 1 2 3 4 5 6 7  8 9 10  11 12 13
	0 1 1 2 3 5 8 13 21 34 45 79 126
	 */
}