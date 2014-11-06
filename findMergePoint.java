
public class findMergePoint {
	public static void main(String args[]){
		ListNode m = new ListNode(0);
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		m.next = a;
		a.next = b;
		b.next =c;
		c.next = d;
		d.next = e;
		ListNode m1 = new ListNode(6);
		ListNode a1 = new ListNode(7);
		ListNode b1 = new ListNode(8);
		ListNode c1 = new ListNode(9);
		m1.next = a1;
		a1.next = b1;
		b1.next =c1;
		c1.next = c;
		c.next = d;
		d.next = e;
		System.out.print(findMerge(m1, m));
		
	}
	public static int findMerge(ListNode m1, ListNode m){
		ListNode move = m1;
		ListNode move1 = m;
		int len = 1;
		int len1 = 1;
		while(move.next != null){
			len++;
			move = move.next;
		}
		while(move1.next != null){
			len1++;
			move1= move1.next;
		}
		System.out.print(len1);
		System.out.print(len);
		int step = Math.abs(len-len1);
		 move = m1;
		 move1 = m;
		if(step != 0){
			if(len1 > len){
				while(step > 0){
					move1 = move1.next;
					step--;
				}
			}else{
				while(step > 0){
					//System.out.print(move1.value);
					//System.out.print(move.value);
					move = move.next;
					step--;
				}
			}
		}
		
		while(move1!= null && move != move1){
			
			move = move.next;
			move1 = move1.next;
		}
		return move.value;
	}
}
