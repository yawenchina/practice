
public class sortColor {
	public static void main(String args[]){
	int[] array = {1,2,3,1,1,1,1,2,2,2,3,3,3};
	array = partitionArray(array);
		for(int i = 0 ;i < array.length ;i++){
			System.out.print(array[i]);
		}
	}
	public static int[] partitionArray(int[] array){
		int i = 0 ;
		int j = 0;
		int k = array.length-1;
		while(j < k){
			if(array[j] == 1){
				swap(i,j,array);
				i++;
				j++;
	}else if (array[j] == 2){
		j++;
	}else{
		k--;
		swap(j,k,array);
	}
	}
		return array;
	}
	public static void swap(int i , int j ,int[] array){
		int temp = array[i];
		 array[i] = array[j];
		array[j] = temp;

	}

}
