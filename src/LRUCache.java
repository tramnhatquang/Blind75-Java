import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		System.out.println(map.get(null)); // null
		System.out.println(map.get(100)); // null



	}
}
