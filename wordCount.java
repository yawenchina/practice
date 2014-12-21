import java.util.*;
public class consequnceString {
	public static void main(String args[]){
		String a = "abcdadcbaa";
		findsubString(a,4);
		
	}
	public static void  findsubString(String m , int k){
		// use to store the final string result
			HashMap<String , Integer> map = new HashMap<String, Integer>();
		// this is for the start one
			HashMap<Character, Integer> rule = new HashMap<Character, Integer>();
		// this is for the sliding window
			HashMap<Character, Integer> check = new HashMap<Character, Integer>();
			char[] array = m.toCharArray();
			Queue<Character> q = new LinkedList<Character>();
			for(int i = 0; i < k ; i++){
				Character a = (char)(((int)'a')+i);
				rule.put(a,1);	
		}
		int count = 0;
		for(int i = 0; i < k; i++){
			q.add(array[i]);
			if(check.containsKey(array[i])){
				if(i == k-1){
						map.put(m.substring(0,k),1);

		}
				check.put(array[i], check.get(array[i])+1);
		}else{
				check.put(array[i],1);
				count++;
		}
		}
			int start = 0;
			while(k < m.length()){
				char top  = q.peek();
				q.poll();
				if(top != array[k]){
					if(check.get(top) == 1){
						check.remove(top);
						if(rule.containsKey(top)){
							count--;
		}
		}else{
		check.put(top, check.get(top)-1);
		}
			if(check.containsKey(array[k])){
				check.put(array[k], check.get(array[k])+1);
			}else{
				check.put(array[k],1);
						if(rule.containsKey(array[k])){
							count++;
		}

		}
		}
		if(count == k){
					String newS = m.substring(start, start+k);
					put(newS, map);
		}
		k++;
		}
		
		for(String mm : map.keySet()){
			
			System.out.print(mm);
			System.out.print(map.get(mm));
		}

		}
		public static void put(String m ,HashMap<String, Integer> map){
			if(map.containsKey(m)){
				map.put(m, map.get(m)+1);
		}else{
			map.put(m, 1);
		}

		}

}
