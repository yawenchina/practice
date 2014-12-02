
public class consetive1 {
	public static void main(String args[]){
		int[] array = {1,1,1,1,0,0,0,1,1,1};
		int[] array1 = {0,0,1,1,0,1,1,1,0};
		System.out.println(find(array));
		System.out.println(find(array1));
		//find the consecutive 1;
	}
	public static int find(int[] array){
		int cur = 0;
		int res = 0;
		//boolean start = false;
		for(int i = 0; i < array.length; i++){
			if(array[i] ==1){
			if((i == 0 ) || array[i-1]!= 1 ){
				cur = 1;
			}else {
				cur++;
				res = Math.max(res, cur);
				}
			}
			

		}
		return res;


	}
}
