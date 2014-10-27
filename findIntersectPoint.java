
public class findIntersectNode {
	public static void main(String args[]){
		ListNode m1 = new ListNode(1);
		ListNode m2 = new ListNode(2);
		ListNode m3 = new ListNode(3);
		ListNode m4 = new ListNode(4);
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		ListNode m11 = new ListNode(11);
		ListNode m21 = new ListNode(22);
		ListNode m31 = new ListNode(32);
		ListNode m41 = new ListNode(43);
		m11.next = m21;
		m21.next = m31;
		m31.next = m41;
		m41.next = m3;
		m3.next = m4;
		findConverge(m1,m11);
		
	}
	public static void findConverge(ListNode m , ListNode n){
		if(m == null || n == null){
			return ;
	}
		int l1 = findLength(m);
		int l2 = findLength(n);
	
		int step = l1-l2;

		if(step != 0){
			if(l1 > l2){
				 m = move(m, Math.abs(step));
			}else{
				 n = move(n, Math.abs(step));

	}
	}
		
	while(m.next != null && m != n){
		m = m.next;
		n =n.next;
	}
		if(m == null ){
			System.out.print("not exist");
	}

		System.out.print(m.data);


	}
	public static int findLength(ListNode m){
		int count =0;
		while(m != null){
		count++;
		m = m.next;
		}
		return count;
	}
	public static ListNode move(ListNode m , int step){
		while(step >0){
			step--;
			m = m.next;
	}
	return m;


	}

}
