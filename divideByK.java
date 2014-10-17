public class divideByK {
	public static void main(String args[]) {
		ListNode root = new ListNode(1);
		root.add(4);
		root.add(7);
		root.add(3);
		root.add(5);
		root.add(6);
		root.add(2);
		// print(root);
		// print(root);
		print(inplace(root, 3));
	}

	public static void print(ListNode m) {
		while (m != null) {
			System.out.print(m.data);
			m = m.next;
		}
	}

	public static ListNode inplace(ListNode k, int target) {
		if (k == null || k.next == null) {
			return k;
		}
		ListNode result = new ListNode(-1);
		result.next = k;
		ListNode head = result;
		while (k.next != null) {
			k = k.next;
		}
		ListNode end = k;
		ListNode move = end;

		while (head.next != end) {
			if (head.next.data < target) {
				head = head.next;
			} else {
				move.next = new ListNode(head.next.data);
				head.next = head.next.next;
				move = move.next;
			}
		}
		return result.next;

	}

}
