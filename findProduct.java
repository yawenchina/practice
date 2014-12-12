
public class findProduct {
	public static void main(String args[]) {
		int[] array = {1,2,3,4,5};
		print(productHelper(array));
	}
	public static int[] productHelper(int[] array){
		int[] newArray = new int[array.length];
		int[] right = new int[array.length];
		find(array, right);
		print(right);
		newArray[0] = right[0];
		int left = 1;
		for(int i = 1; i < array.length; i++){
			newArray[i] = left* right[i];
			left *= array[i];
		}
		return newArray;
	}
	public static void find (int[] newArray, int[] right) {
		right[newArray.length-1] = 1;
		for (int i = newArray.length-2; i >= 0; i--) {
			right[i] = right[i+1]*newArray[i+1];
		}
	}
	public static void print(int[] array){
		for(int i : array){
			System.out.print(i);
		}
		System.out.println();
	}
}
