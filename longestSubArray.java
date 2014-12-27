
public class findLongestSub {
	public static void main(String args[]){
		int[] array = {1,3,5,2,4,5,7,932,3,5};
		System.out.print(longest(array));
	}
	public static int longest(int[] array){
		int res = array[0];
		int num = 1;
		int m = 1;
		for(int i = 1; i < array.length; i++){
			if(array[i] > res){
				m++;
				
			}else{
				m = 1;
			}
			res = array[i];
			num = Math.max(num,m);

		}

		return num;

	}
}
