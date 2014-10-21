import java.util.*;
public class findKth {
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5,10,11,15,18,20};
		print(findKCloset(arr, 5,16));
		print(findKCloset(arr, 5,15));
		
	}
	public static void print(ArrayList<Integer> one){
		for(int m : one){
			System.out.print(m+" ");
		}
		System.out.println("");
	}
	public static ArrayList<Integer> findKCloset(int[] arr, int k, int X){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (arr == null || arr.length == 0){
			return result;
		}
		if (k >= arr.length) {
			for(int value: arr){
				result.add(value);
		}
		return result;
	}
	int index = findIndex(arr, X);
	
		result.add(arr[index]);
		return findKResult(arr, X, k-1, result, index );

	//System.out.print(index);
	//return result;
	

	}
	public static int findIndex(int[] arr, int X) {
			int start = 0;
			int end = arr.length-1;
			while (start < end-1) {
				int mid = (start+end)/2;
				if (arr[mid] == X){
					return mid;
	}else if (arr[mid] < X){
			start = mid;
	}else{
			end = mid;
	}
		}
	return Math.abs(arr[start] - X) > Math.abs(arr[end] - X) ? end : start;
	}
	public static ArrayList<Integer>  findKResult(int[] arr, int X,int k, ArrayList<Integer> result, int index){
		int left = index-1;
		int right = index+1;
		int step = 0;
		
		while(step < k &&(left >= 0 || right < arr.length)){
			if(left <=0){
				result.add(arr[right]);
				right++;
			}else if(right >= arr.length){
				result.add(arr[left]);
				left--;
			}else if(Math.abs(arr[left] - X) > Math.abs(arr[right] - X)){
				result.add(arr[right]);
				right++;
			}else{
				result.add(arr[left]);
				left--;
			}
			step++;
		}
		return result;
	}


}
