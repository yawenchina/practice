
public class mixedArrat1 {
public static void main (String args[]) {
		
		int[] a = {1,2,3,4,5,6,-1,-2,-3,-4};
		int[] b = {1,2,3,-1,-2,-3,-4,-5};
		int[] c = {1,2,3,4,-1,-2,-3,-4};
		print(mix(a));
		print(mix(b));
		print(mix(c));

	}
	public static void print (int[] array) {
		for (int temp : array) {
			System.out.print(temp);
		}
		System.out.println();
	}
	public static int[]  mix(int[] array){
		int f = 1;
		int start = 0;
		int last = array.length-1;
		while(start < last-1){
			int  mid = (start+last)/2;
			if(array[mid] < 0){
				last = mid;
			}else{
				start = mid;
			}
		}
		boolean check = false;
		int s = last;
		while(s < array.length && f < array.length){
			if(check){
				check = !check;
				f++;
			}else{
				if(array[f] > 0)
				swap(array, s, f);
				s++;
				f++;
				check =!check;
			}
		}
		
		return array;
	}
	public static void swap(int[] array, int i , int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
