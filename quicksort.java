public void find (int[] array, k) {
	int[] helper = quicksort(array, 0, array,length-1);
	return helper[k-1]

}

public int[] quicksort (int[] array, int start, int end) {
	int pivot = array[end];
	int j = start;
	int k = end -1;
	int i = start;
	while(i  < k){
		if (array[i] > pivot){
			swap(i, j , array);
			j++;
			i++;
}else{
	swap(i, k, array);
	k--;
}

}
swap(a, j, i );
quicksort(array, start, i);
quicksort(array, i+1, end);

}

public void swap(int[] array, int start, int end){
	int temp = array[start];
	array[start] = array[end];
	array[end] = temp;
}
