import java.util.*;
public class wordLadder2 {
	
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
		public static void wordLadderHelper(HashSet<String> set, String start, String target) {
			HashMap<String, String> map = new HashMap<String, String>();
			Queue<String> q = new LinkedList<String>();
			q.offer(start);
			while (!q.isEmpty()) {
				String temp = q.poll();
				//System.out.print(temp);
				for(char a = 'a'; a <= 'z';a++){
					for(int i = 0; i < temp.length(); i++){
						StringBuffer m = new StringBuffer(temp);
						if (m.charAt(i) == a) {
							continue;
						}
						m.setCharAt(i, a);
						String news = m.toString();
						if(news.equals(target)){
							map.put(target, temp);
							print(map,start,target);
							//System.out.println("here"+news);
							return;
						}
						if(set.contains(news) && !map.containsKey(news)){
							map.put(news, temp);
							q.offer(news);
							//System.out.println(news+"dsfasd"+temp);
						}

					}
				}
			}

				return ;


		}
		public static void print(HashMap<String, String> map, String start,String target){
			ArrayList<String> res = new ArrayList<String>();
			String m = target;
			while(map.containsKey(m) && !m.equals(start)){
				res.add(m);
				//System.out.println(m);
				m  = map.get(m);
			}
			for (int j = res.size()-1; j >= 0; j--) {
				System.out.print(res.get(j));
			}

		}


}
