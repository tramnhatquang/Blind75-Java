import Utility.ListNode;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				curr.next = list1;
				list1 = list1.next;
			} else {
				curr.next = list2;
				list2 = list2.next;
			}

			// move the curr pointer
			curr = curr.next;
		}

		// at here, one list is empty, the other is not
		curr.next = list1 == null ? list2 : list1;

		return dummy.next;
	}

	// time: O(n) = space, n is the total lengths of two LLs


	public static void main(String[] args) {

		System.out.println("Hello World");
	}
}
