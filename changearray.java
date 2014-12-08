
public class changetoLarget {
	public static void main(String args[]){
		int[] array = {16, 17, 4, 3, 5, 2};
		changeArray(array);
		print(array);
	}
	public static void changeArray (int[] array) {
		int max = array[array.length-1];
		array[array.length-1] = -1;
		for (int i = array.length-2; i >= 0; i--) {
			array[i] = Math.max(max, array[i]);
			max = array[i];
	}


	}
	public static void print(int[] array){
		for(int i : array){
			System.out.print(i);
		}
	}

}
