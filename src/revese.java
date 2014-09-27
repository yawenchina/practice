import java.util.*;
public class revese {
	public static void main (String[] args) throws java.lang.Exception
	{
			ListNode input = new ListNode(-1);
			ListNode f = input;
			input.next = new ListNode(1);
			input.next = input;
			input.next = new ListNode(2);
			input.next = input;
			input.next = new ListNode(3);
			input.next = input;
			ListNode newOne = reverse(f);
			while(newOne != null){
				System.out.print(newOne.val);
				newOne = newOne.next;
			}
	}
	public static ListNode reverse(ListNode f){
		ListNode pre = f;
		ListNode cur = f.next;
		ListNode next = cur.next;
		ListNode result = cur;
		pre.next = null;
		cur.next = pre;
		if(next == null){
			return result;
		}
		while(next != null){
			pre = cur;
	
			cur = next;
			next = next.next;
			cur.next = pre;
			
		}
		result = cur ;
		return result;
	}
}
