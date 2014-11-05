public int container(int[] A){
	
	int sum = 0;
	int left = 0;
	int right = A.length-1;
	while(left  <= right){
		sum = Math.max((right-left)*(Math.min(A[right],A[left])),sum);
		if(A[right] < A[left]){
			right++;
		}else{
			left--;
		}


	}

	return sum;


}