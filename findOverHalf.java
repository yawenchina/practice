
public class findOverHalf {
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6,6,6,6,7,6,6,6,6};
		System.out.print(findOverHalf1(array));
	}
	public static int findOverHalf1 (int[] array){
		if(array == null || array.length == 0){
			return -1;
	}
		int number = 1;
		int result = array[0];
		for(int i = 1; i < array.length ;i++){
			if(array[i] == result){
				number++;
	}else{
		number--;
		if(number == 0){
			result = array[i];
			number = 1;
	}
	}
	}

		return result;
	}


}
