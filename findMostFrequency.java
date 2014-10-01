import java.util.*;
public class findMax {
	public static void main(String args[]){
		int[] m = {1,2,3,4,5,1,1,1,1,13,3,3};
		System.out.print(findFrequent(m));
}
	public static int findFrequent(int[] array){
		HashMap<Integer,  Integer> map = new HashMap<Integer, Integer>();
		int  number = 0;
		int  result = -1;
		for(int i = 0; i < array.length ;i++){
			if(map.containsKey(array[i])){
				if(number < map.get(array[i])+1){
					number = map.get(array[i])+1;
					result = array[i];
				}
				map.put(array[i], map.get(array[i])+1);
			}else{
				map.put(array[i],1);
				if(number < 1){
					number = 1;
					result = array[i];
				}
					
			}

		}
		return result;

	}

}
