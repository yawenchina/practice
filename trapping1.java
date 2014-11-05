public int trap(int[] a){
	if(a == null || a.length() <= 1){
		return 0;
	}
	int sum = 0;
	int left = 0;
	int right = 0;
	int i = 0;
	int j = a.length-1;
	while(i <= j){
		left = Math.max(left,A[i]);
		right = Math.max(right, A[i]);
		if(left < right){
			i++;
			max += left-A[i];
		}else{
			j--;
			max +=right-A[j];
		}
	}
	return max;




}