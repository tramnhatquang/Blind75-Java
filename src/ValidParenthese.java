import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthese {


	public boolean isValid(String s) {
		Map<Character, Character> mapOpenToClose = new HashMap<>();

		// map each open to close parentheses initially
		mapOpenToClose.put('(', ')');
		mapOpenToClose.put('[', ']');
		mapOpenToClose.put('{', '}');

		Deque<Character> stack = new ArrayDeque<>();

		for (char bracket : s.toCharArray()) {
			// append open bracket to the stack
			if (mapOpenToClose.containsKey(bracket))
				stack.push(bracket);
			else {
				// if the stack is not empty and the top of stack is a match to the curr close bracket. We pop the top
				// out and continue to the next bracket
				if (!stack.isEmpty() && mapOpenToClose.get(stack.peek()) == bracket)
					stack.pop();
				else {
					return false;
				}
			}

		}

		return stack.isEmpty();

	}

	// time: O(n), n is length of input string
	// space: O(n) for the stack data structure

	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
		System.out.println(queue);

		queue.poll();

		System.out.println(queue);
	}
}
