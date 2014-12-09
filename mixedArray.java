
public class mixedArray {
	public static void main (String args[]) {
		
		int[] a = {1,2,3,4,5,6,-1,-2,-3,-4};
		//this test case can not pass 
		// the result is 1 -1 2 -3 3 6 5 -2 4 -4
		//int[] b = {1,2,3,-1,-2,-3,-4,-5};
		//int[] c = {1,2,3,4,-1,-2,-3,-4};
		print(mix(a));
		//print(mix(b));
		//print(mix(c));

	}
	public static void print (int[] array) {
		for (int temp : array) {
			System.out.print(temp);
		}
		System.out.println();
	}
	public static int[] mix(int[] array){
		int i = 0;
		int j = 1;
		int index = 0;
		while (j < array.length && i < array.length-1) {
			if (array[index] > 0) {
				swap(i, index, array);
				i += 2;
			}else{
				swap(j, index, array);
				j += 2;

			}
			index = i < j ? i : j;

		}
		return array;


	}
	public static void swap (int i, int j , int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;




	}
}
