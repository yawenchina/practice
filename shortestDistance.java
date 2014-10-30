import java.util.*;
public class shortestDistance {

	
	
	
	public static void main (String args[]) {
		ArrayList<Integer> result =find(5);
		print(result);


	}
	public static void print(ArrayList<Integer> result){
		for(int one : result){
			System.out.println(one);
	}

	}
	public static ArrayList<Integer> find(int input){
		int r = 1;
		int s = 0;
		int t = 0;
		////3,5,7
		PriorityQueue<PairT> pq = new PriorityQueue<PairT>(2*input, new Comparator<PairT>(){
		public int compare(PairT m , PairT n){
			int value = m.x*m.x*3+m.y*m.y*5+m.z*m.z*7;
			int value1 = n.x*n.x*3+n.y*n.y*5+n.z*n.z*7;
			return value-value1;
			
	}
	}
	);
		
		
		PairT p = new PairT();
		p.x =1;
		
		PairT p1 = new PairT();
		p1.y =1;
		PairT p2 = new PairT();
		p2.z = 1;
		pq.offer(p);
		pq.offer(p1);
		pq.offer(p2);

		int times =1;
		ArrayList<Integer> result = new ArrayList<Integer>();

		HashMap<PairT,Boolean> map = new HashMap<PairT,Boolean>();
		map.put(p,true);
		map.put(p1,true);
		map.put(p2,true);
		while(times <= input &&!pq.isEmpty()){
			
			p = pq.poll();
		 r = p.x;
	s = p.y;
	 t = p.z;
	System.out.print(r);
	System.out.print(s);
	System.out.print(t);
	System.out.println("");
	int value = r*r*3+s*s*5+t*t*7;
	result.add(value);
	PairT a = new PairT(r+1,s,t);
	PairT b = new PairT(r,s+1,t);
	PairT c = new PairT(r,s ,t+1);
	if(!map.containsKey(a)){
		map.put(a,true);
		pq.offer(a);
		
	}
	if(!map.containsKey(b)){
		map.put(b,true);
		pq.offer(b);
		
	}
	if(!map.containsKey(c)){

		map.put(c,true);
		pq.offer(c);
	}
	times++;


	}
		
		return result;

	}


}
