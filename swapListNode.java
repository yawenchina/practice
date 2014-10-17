/*
	this program is to change the list by the odd index and even index
	for example :
	 1->2->3->4->5
	 to 
	 1->3->5->2->4
	 author @yawen yu
*/
import java.util.*;
public class mixList {
	public static void main(String args[]){
		ListNode root = new ListNode(1);
		root.add(2);
		root.add(3);
		root.add(4);
		root.add(5);
		root.add(6);
		root.add(7);
		//print(root);
		print(swapListNode(root));
	}
	public static void print(ListNode m){
		while(m != null){
			System.out.print(m.data);
			m = m.next;
		}
	}
	public static ListNode swapListNode(ListNode m ){
		if(m == null ||  m.next == null){
			return m;
	}
		ListNode head1 = new ListNode(-1);
		ListNode  result = head1;
		ListNode head2 = new ListNode(-1);
		ListNode result1 = head2;
		boolean odd = true;
		while(m != null){
			if(odd){
				head1.next = new ListNode(m.data);
				head1 = head1.next;
	}else{
		head2.next = new ListNode(m.data);
		head2 = head2.next;
	}
				m = m.next;
				odd =!odd;
	}
	head1.next = result1.next;
	return result.next;


	}

}
