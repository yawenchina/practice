public class findMedium{
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6,7,8,9};
		//sorted /duplicates
		System.out.print(findMedian(array, 6));

	}
	public static int findMedian(int[] array, int target){
		// find the index of  it !!
		int first = 0;
		int last = array.length-1;
		while(first != last){
			int mid = (first+last)/2;

			if(array[mid] ==  target){
				break;
			}else if(array[mid] < target){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		int end = array.length-1;
		if(A[mid] == target){
				int mid = mid+end;
				if(mid%2 == 0){
					return array[mid/2];
				}else{
					int value = array[mid/2]+array[mid/2+1];
					return value/2;
				}
		}else{
			return -1;
		}
	}



}