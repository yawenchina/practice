
public class encode {
	public static void main(String args[]){
		String m = "sdfajkljflaQWE";
		HashMap<Charcter, Integer> map = new TreeMap<Character, Integer>();
		for(Character c : m.toCharArray()){
			int value = map.containsKey(c) ? map.get(c) : 1;
			map.put(c, value);
		}
		StringBuffer bu = new StringBuffer();
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			bu.append(entry.getKey()).append(entry.getValue());
		}
		System.out.print(bu.toString());
	}
}
