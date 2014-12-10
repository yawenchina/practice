import java.util.*;
public class wordLadder {
	public static void main(String args[]){
		String a = "car";
		HashSet<String> set = new HashSet<String>();
		set.add("car");
		set.add("cat");
		set.add("mat");
		set.add("get");
		set.add("got");
		set.add("gat");
		set.add("mao");
		set.add("gao");
		wordLadderHelper(set, a, "gao");
	}
	public static void wordLadderHelper(HashSet<String> set, String start, String end){
		HashMap<String, String>  map = new HashMap<String,String>();
		Queue<String> q = new LinkedList<String>();
		q.add(start);
		int step = 0;
		set.remove(start);
		while(!q.isEmpty()){
			int size = q.size();
			for(int k = 0; k < size; k++){
			String m = q.poll();
			for(char a = 'a'; a <='z'; a++){
				for(int j = 0; j < m.length(); j++){
					if(m.charAt(j) == a){
						continue;
					}
					String temp = replace(m, j,a);
					if(temp.equals(end)){
						System.out.println(step+1);
						map.put(temp,m);
						String target = end;
						while(map.containsKey(target)){
							System.out.println(map.get(target));
							target = map.get(target);
						}
						return ;
					}
					if(set.contains(temp)){
					q.add(temp);
					set.remove(temp);
					map.put(temp,m);
					}

				}
			}
			}
			step++;
		}
		return;


	}
	public static String replace(String temp, int index, char t){
		char[] array = temp.toCharArray();
		array[index] = t;
		return new String(array);
	}
}
