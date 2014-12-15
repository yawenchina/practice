
public class reverseListNode {
	public static void main(String args[]){
		ListNode root = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		root.next = a;
		a.next = b;
		b.next = c;
		c.next = root;
		print(root);
		ListNode tail = root;
		ListNode past = null;
		
		while(root.next != tail){
			ListNode pre = root.next;
			root.next = past;
			past = root;
			root = pre;

		}
		root.next = past;
		tail.next = root;
		print(root);


	}
	public static void print(ListNode root){
		ListNode m = root;
		System.out.print(root.val);
		while(root.next != m){
			System.out.print(root.next.val);
			root = root.next;
		}
		System.out.println();
	}
	
}
