public static int jumpGame(int[] array){
	int[] step = new int[array.length+1];
	step[0] = 0; 
	for (int k = 1; k <= array.length; k++){
		for (int j = 1; i <= k ; i++) {
			step[k] = Integer.MAX_VALUE;
			if(step[k-j] != Integer.MAX_VALUE && A[k-j] >= j){
				step[k] = Math.min(step[k], step[k-j]+1);
			}
		}
	}

	return step[array.length];

}


