public static void main(String args[]){
	int[] array = {1,2,3,1,2,4,5,8,2};
	System.out.print(longest(array));

}
public int longestA(int[] array){
	int result = 0;
	int cur = 1;
	for(int i = 1; i < array.length;i++){
		if(array[i] > array[i-1]){
			cur++;
		}else{
			result = Math.max(result, cur);
			cur = 1;
		}
	}

return result;

}