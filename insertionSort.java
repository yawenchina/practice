
public class selectionSort {
	public static void main(String args[]){
		int[] array = {1,3,2,4,1,2,4,5};
		array = insert(array);
		print(array);
	}
	public static int[]  insert(int[] array){
		for(int i = 0 ; i <  array.length-1; i++){
			int min =i;
			for(int j = i+1; j < array.length ;j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			swap(i,min,array);
		}
		return array;
	}
	public static void print(int[] array){
		for(int i : array){
			System.out.print(i);
		}
	}
	public static void swap(int i ,int j ,int[] array){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
