import java.util.Arrays;


public class find12kth {
	public static void main(String args[]) {
		int[] array = {1,2,3,4,5,7,8,9,2,78,4,3,211};
		findArray(array);
		Arrays.sort(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[4]);

	}
	public static findArray(int[] array) {
		int s = Integer.MAX_VALUE;
		int ss = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++){
			if (array[i] < ss) {
				if (array[i] < s) {
					ss = s;
					s = array[i];

				}else{
					ss = array[i];
				}
			}
		}

		System.out.println(s);
		System.out.println(ss);


	}
}
