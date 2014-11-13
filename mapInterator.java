
public class mapInterator {
	public static void main(String args[]){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1,1);
		map.put(2,2);
		map.put(3,3);
		Set set = map.entrySet();
		Interator iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry me = (Map.Entry) iter.next();
			System.out.print(me.getKey());
			Syetm.out.print(me.getValue());
		}

	}
}
