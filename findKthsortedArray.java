import java.util.*;
public class findKthsortedArray {
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		b.add(1);
		b.add(3);
		b.add(5);
		b.add(7);
		b.add(9);
		c.add(0);
		c.add(2);
		c.add(4);
		c.add(6);
		c.add(8);
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		input.add(a);
		input.add(b);
		input.add(c);
		System.out.print(findhelper(input, 5));
		
	}
	public static int findhelper (ArrayList<ArrayList<Integer>> input, int num) {
		PriorityQueue<ArrayList<Integer>> q = new PriorityQueue<ArrayList<Integer>>(input.size(), new 
				comparator(){
			@overide
			
		});
	}
}
