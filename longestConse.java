import java.util.*;
public class longestS {
	public static void main(String args[]){
		int[] array = {1,2,19,4,3,5};
		HashSet<Integer> map = new HashSet<Integer>();
		for(int i  : array){
			if(!map.contains(i)){
				map.add(i);
	}
	}
	int count = 0;
	int max = 0;
	for(int i = 0 ; i < array.length; i++){
		if(map.contains(array[i])){
			map.remove(array[i]);
			count++;
			
			
				max = Math.max(check(map, count,array[i]),max);
				count = 0;
		}
	}

		System.out.print(max);

	}
	public static int check(HashSet<Integer> map, int count, int array){
		int number = array;
		while(map.contains(number-1)){
			count++;
			map.remove(number-1);
			number--;
	}
	while(map.contains(array+1)){
			count++;
			map.remove(array+1);

			array++;
	}

	return count;

	}

}
