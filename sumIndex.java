
public class sumIndex {
	public static void  main(String args[]){
		int[] array = {1,2,3,4,5,6,0,4};
		System,out.print(find(array));
	}
	////4  0  0   4
	public static int find(int[] array){
		int start = 0;
		int end = array.length-1;
		int left = 0;
		int right = 0;
		while(start < end-1){
			if(left < right){
				left += array[start++];
			}else if(left >= right){
				right +=array[end--];
			}
		}
		return start+1;
	}
}
