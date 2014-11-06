
	import java.util.*;
	public class noRepeat {
		public static void main(String args[]){
			String m = "sfkaslfjnklsavg";
			System.out.print(put(m));
		}
		public static char put(String word) { 
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			int index = 0;
			for(char m : word.toCharArray()){
				if(map.containsKey(m)){
					map.put(m,-1);
				}else{
					map.put(m,index)
				}
				index++;
			}
			int min;
			char result;
			for(Map.Entry<Character, Integer> entry : map.entrySet()){
					if(entry.getValue() != -1 ){
						if(entry.getValue() < min){
							min = entry.getValue();
							result = entry.getKey();
						}
					}

			}
			return result;

		} 

		
	}


