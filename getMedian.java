import java.util.*;
public class getMedian {
	public static void main(String args[]){
		int[] array = {1,234,123,5,4,6,7,854,21};
		int length = array.length;
		PriorityQueue<Integer> max = new PriorityQueue<Integer>(length/2+1,Collections.reverseOrder());
		PriorityQueue<Integer> min = new PriorityQueue<Integer>(length/2+1);
		int smax = 0;
		int smin = 0;
		for(int i : array){
			if(smax == smin){
				if(max.isEmpty() || i <= max.peek()){
					max.add(i);
					smax++;
				}else{
					max.add(min.poll());
					smax++;
					min.add(i);
				}
			}else if(smax >= smin){
				if(min.isEmpty() || i > min.peek()){
					min.add(i);
					smin++;
				}else{
					min.add(max.poll());
					smin++;
					max.add(i);
				}
			}
		}
		int value = 0;
		if(smax == smin){
			value = (max.peek()+min.peek())/2;
		}else{
			value = max.peek();
		}
		System.out.print(value);
	}
}
